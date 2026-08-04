package com.facebook.react.views.text;

import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import androidx.window.reflection.WindowExtensionsConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FontMetricsUtil.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/text/FontMetricsUtil;", "", "<init>", "()V", "CAP_HEIGHT_MEASUREMENT_TEXT", "", "X_HEIGHT_MEASUREMENT_TEXT", "AMPLIFICATION_FACTOR", "", "getFontMetrics", "Lcom/facebook/react/bridge/WritableArray;", "text", "", WindowExtensionsConstants.LAYOUT_PACKAGE, "Landroid/text/Layout;", "dm", "Landroid/util/DisplayMetrics;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FontMetricsUtil {
    private static final float AMPLIFICATION_FACTOR = 100.0f;
    private static final String CAP_HEIGHT_MEASUREMENT_TEXT = "T";
    public static final FontMetricsUtil INSTANCE = new FontMetricsUtil();
    private static final String X_HEIGHT_MEASUREMENT_TEXT = "x";

    private FontMetricsUtil() {
    }

    @JvmStatic
    public static final WritableArray getFontMetrics(CharSequence text, Layout layout, DisplayMetrics dm) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(dm, "dm");
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint = new TextPaint(layout.getPaint());
        textPaint.setTextSize(textPaint.getTextSize() * AMPLIFICATION_FACTOR);
        int i = 0;
        int i2 = 1;
        textPaint.getTextBounds("T", 0, 1, new Rect());
        float height = (r6.height() / AMPLIFICATION_FACTOR) / dm.density;
        Rect rect = new Rect();
        String str = X_HEIGHT_MEASUREMENT_TEXT;
        textPaint.getTextBounds(X_HEIGHT_MEASUREMENT_TEXT, 0, 1, rect);
        float height2 = (rect.height() / AMPLIFICATION_FACTOR) / dm.density;
        int lineCount = layout.getLineCount();
        while (i < lineCount) {
            float lineWidth = (text.length() <= 0 || text.charAt(layout.getLineEnd(i) - i2) != '\n') ? layout.getLineWidth(i) : layout.getLineMax(i);
            layout.getLineBounds(i, new Rect());
            WritableMap createMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
            readableMapBuilder.put(str, layout.getLineLeft(i) / dm.density);
            readableMapBuilder.put("y", r12.top / dm.density);
            readableMapBuilder.put(ViewProps.WIDTH, lineWidth / dm.density);
            readableMapBuilder.put(ViewProps.HEIGHT, r12.height() / dm.density);
            readableMapBuilder.put("descender", layout.getLineDescent(i) / dm.density);
            readableMapBuilder.put("ascender", (-layout.getLineAscent(i)) / dm.density);
            readableMapBuilder.put("baseline", layout.getLineBaseline(i) / dm.density);
            readableMapBuilder.put("capHeight", height);
            readableMapBuilder.put("xHeight", height2);
            readableMapBuilder.put("text", text.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString());
            createArray.pushMap(createMap);
            i++;
            str = str;
            lineCount = lineCount;
            i2 = 1;
        }
        return createArray;
    }
}
