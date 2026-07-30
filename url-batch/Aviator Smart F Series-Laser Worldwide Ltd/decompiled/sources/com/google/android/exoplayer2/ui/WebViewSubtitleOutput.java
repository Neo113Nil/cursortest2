package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.ui.SpannedToHtmlConverter;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    private static int anchorTypeToTranslatePercent(int i8) {
        if (i8 != 1) {
            return i8 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String convertAlignmentToCss(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i8 = AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        return i8 != 1 ? i8 != 2 ? TtmlNode.CENTER : "end" : "start";
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i8 = captionStyleCompat.edgeType;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "unset" : Util.formatInvariant("-0.05em -0.05em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor)) : Util.formatInvariant("0.06em 0.08em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor)) : Util.formatInvariant("0.1em 0.12em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor)) : Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
    }

    private String convertTextSizeToCss(int i8, float f8) {
        float resolveTextSize = SubtitleViewUtils.resolveTextSize(i8, f8, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return resolveTextSize == -3.4028235E38f ? "unset" : Util.formatInvariant("%.2fpx", Float.valueOf(resolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    private static String convertVerticalTypeToCss(int i8) {
        return i8 != 1 ? i8 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String getBlockShearTransformFunction(Cue cue) {
        float f8 = cue.shearDegrees;
        if (f8 == 0.0f) {
            return "";
        }
        int i8 = cue.verticalType;
        return Util.formatInvariant("%s(%.2fdeg)", (i8 == 2 || i8 == 1) ? "skewY" : "skewX", Float.valueOf(f8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x014d, code lost:
    
        if (r13 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0150, code lost:
    
        r21 = com.google.android.exoplayer2.text.ttml.TtmlNode.LEFT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
    
        if (r13 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateWebView() {
        String formatInvariant;
        int i8;
        boolean z7;
        float f8;
        String str;
        int i9;
        String str2;
        String str3;
        int i10;
        Iterator it;
        Layout.Alignment alignment;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb = new StringBuilder();
        char c8 = 0;
        String convertTextSizeToCss = webViewSubtitleOutput.convertTextSizeToCss(webViewSubtitleOutput.defaultTextSizeType, webViewSubtitleOutput.defaultTextSize);
        int i11 = 1;
        float f9 = CSS_LINE_HEIGHT;
        sb.append(Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", HtmlUtils.toCssRgba(webViewSubtitleOutput.style.foregroundColor), convertTextSizeToCss, Float.valueOf(CSS_LINE_HEIGHT), convertCaptionStyleToCssTextShadow(webViewSubtitleOutput.style)));
        HashMap hashMap = new HashMap();
        hashMap.put(HtmlUtils.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), Util.formatInvariant("background-color:%s;", HtmlUtils.toCssRgba(webViewSubtitleOutput.style.backgroundColor)));
        int i12 = 0;
        while (i12 < webViewSubtitleOutput.textCues.size()) {
            Cue cue = webViewSubtitleOutput.textCues.get(i12);
            float f10 = cue.position;
            float f11 = f10 != -3.4028235E38f ? f10 * 100.0f : 50.0f;
            int anchorTypeToTranslatePercent = anchorTypeToTranslatePercent(cue.positionAnchor);
            float f12 = cue.line;
            if (f12 == -3.4028235E38f) {
                Object[] objArr = new Object[i11];
                objArr[c8] = Float.valueOf((1.0f - webViewSubtitleOutput.bottomPaddingFraction) * 100.0f);
                formatInvariant = Util.formatInvariant("%.2f%%", objArr);
                i8 = -100;
            } else if (cue.lineType != i11) {
                Object[] objArr2 = new Object[i11];
                objArr2[c8] = Float.valueOf(f12 * 100.0f);
                formatInvariant = Util.formatInvariant("%.2f%%", objArr2);
                i8 = cue.verticalType == i11 ? -anchorTypeToTranslatePercent(cue.lineAnchor) : anchorTypeToTranslatePercent(cue.lineAnchor);
            } else if (f12 >= 0.0f) {
                Object[] objArr3 = new Object[i11];
                objArr3[c8] = Float.valueOf(f12 * f9);
                formatInvariant = Util.formatInvariant("%.2fem", objArr3);
                i8 = 0;
            } else {
                Object[] objArr4 = new Object[i11];
                objArr4[c8] = Float.valueOf(((-f12) - 1.0f) * f9);
                formatInvariant = Util.formatInvariant("%.2fem", objArr4);
                i8 = 0;
                z7 = true;
                f8 = cue.size;
                if (f8 == -3.4028235E38f) {
                    Object[] objArr5 = new Object[i11];
                    objArr5[0] = Float.valueOf(f8 * 100.0f);
                    str = Util.formatInvariant("%.2f%%", objArr5);
                } else {
                    str = "fit-content";
                }
                String convertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                String convertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                String convertTextSizeToCss2 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
                String cssRgba = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : webViewSubtitleOutput.style.windowColor);
                int i13 = i8;
                i9 = cue.verticalType;
                String str4 = TtmlNode.RIGHT;
                str2 = "top";
                if (i9 == 1) {
                    if (i9 != 2) {
                        str4 = z7 ? "bottom" : "top";
                        str2 = TtmlNode.LEFT;
                    }
                }
                if (i9 != 2 || i9 == 1) {
                    str3 = com.arthenica.ffmpegkit.x.KEY_HEIGHT;
                    i10 = i13;
                    i13 = anchorTypeToTranslatePercent;
                } else {
                    str3 = com.arthenica.ffmpegkit.x.KEY_WIDTH;
                    i10 = anchorTypeToTranslatePercent;
                }
                SpannedToHtmlConverter.HtmlAndCss convert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    String str5 = (String) it.next();
                    SpannedToHtmlConverter.HtmlAndCss htmlAndCss = convert;
                    String str6 = (String) hashMap.put(str5, (String) hashMap.get(str5));
                    Assertions.checkState(str6 == null || str6.equals(hashMap.get(str5)));
                    it = it2;
                    convert = htmlAndCss;
                }
                SpannedToHtmlConverter.HtmlAndCss htmlAndCss2 = convert;
                sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i12), str2, Float.valueOf(f11), str4, formatInvariant, str3, str, convertAlignmentToCss, convertVerticalTypeToCss, convertTextSizeToCss2, cssRgba, Integer.valueOf(i10), Integer.valueOf(i13), getBlockShearTransformFunction(cue)));
                sb.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                alignment = cue.multiRowAlignment;
                if (alignment == null) {
                    sb.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                    sb.append(htmlAndCss2.html);
                    sb.append("</span>");
                } else {
                    sb.append(htmlAndCss2.html);
                }
                sb.append("</span>");
                sb.append("</div>");
                i12++;
                f9 = CSS_LINE_HEIGHT;
                c8 = 0;
                webViewSubtitleOutput = this;
                i11 = 1;
            }
            z7 = false;
            f8 = cue.size;
            if (f8 == -3.4028235E38f) {
            }
            String convertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            String convertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            String convertTextSizeToCss22 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
            String cssRgba2 = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : webViewSubtitleOutput.style.windowColor);
            int i132 = i8;
            i9 = cue.verticalType;
            String str42 = TtmlNode.RIGHT;
            str2 = "top";
            if (i9 == 1) {
            }
            if (i9 != 2) {
            }
            str3 = com.arthenica.ffmpegkit.x.KEY_HEIGHT;
            i10 = i132;
            i132 = anchorTypeToTranslatePercent;
            SpannedToHtmlConverter.HtmlAndCss convert2 = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            it = hashMap.keySet().iterator();
            while (it.hasNext()) {
            }
            SpannedToHtmlConverter.HtmlAndCss htmlAndCss22 = convert2;
            sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i12), str2, Float.valueOf(f11), str42, formatInvariant, str3, str, convertAlignmentToCss2, convertVerticalTypeToCss2, convertTextSizeToCss22, cssRgba2, Integer.valueOf(i10), Integer.valueOf(i132), getBlockShearTransformFunction(cue)));
            sb.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            alignment = cue.multiRowAlignment;
            if (alignment == null) {
            }
            sb.append("</span>");
            sb.append("</div>");
            i12++;
            f9 = CSS_LINE_HEIGHT;
            c8 = 0;
            webViewSubtitleOutput = this;
            i11 = 1;
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<html><head><style>");
        for (String str7 : hashMap.keySet()) {
            sb2.append(str7);
            sb2.append("{");
            sb2.append((String) hashMap.get(str7));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.webView.loadData(Base64.encodeToString(sb.toString().getBytes(Charsets.UTF_8), 1), "text/html", "base64");
    }

    public void destroy() {
        this.webView.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        if (!z7 || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f8, int i8, float f9) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f8;
        this.defaultTextSizeType = i8;
        this.bottomPaddingFraction = f9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            Cue cue = list.get(i9);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f8, i8, f9);
        invalidate();
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.emptyList();
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }
}
