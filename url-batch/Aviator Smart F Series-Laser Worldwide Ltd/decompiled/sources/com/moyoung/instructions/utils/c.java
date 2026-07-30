package com.moyoung.instructions.utils;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.moyoung.instructions.R$color;
import com.moyoung.instructions.model.InstructBean;
import com.moyoung.instructions.widgets.VideoPagerComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class c {
    private static final int CONTENT_TEXT_SIZE = 12;
    private static final int DEFAULT_HORIZONTAL_MARGIN = 20;
    private static final String END_TAG = "</p>";
    private static final int HIGH_LIGHT_TEXT = R$color.assist_14;
    private static final String TAG = "<p>";
    private static final int TITLE_TEXT_SIZE = 17;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$moyoung$instructions$utils$ContentType;

        static {
            int[] iArr = new int[ContentType.values().length];
            $SwitchMap$com$moyoung$instructions$utils$ContentType = iArr;
            try {
                iArr[ContentType.TEXT_TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$ContentType[ContentType.TEXT_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$ContentType[ContentType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$ContentType[ContentType.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static List<Uri> UriParses(Context context, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.parse("android.resource://" + context.getPackageName() + "/" + it.next().intValue()));
        }
        return arrayList;
    }

    public static void addContentTextViewBean(List<InstructBean> list, int i8, int i9, int i10) {
        InstructBean instructBean = new InstructBean();
        instructBean.setType(ContentType.TEXT_CONTENT);
        instructBean.setTextContentRes(i8);
        instructBean.setTextColorRes(i9);
        instructBean.setTextSize(12);
        instructBean.setHorizontalMargin(20);
        instructBean.setBottomMargin(i10);
        list.add(instructBean);
    }

    public static void addImageviewBean(List<InstructBean> list, int i8, int i9) {
        InstructBean instructBean = new InstructBean();
        instructBean.setType(ContentType.IMAGE);
        instructBean.setImageRes(i8);
        instructBean.setBottomMargin(i9);
        instructBean.setHorizontalMargin(20);
        list.add(instructBean);
    }

    static void addTitleTextviewBean(List<InstructBean> list, int i8) {
        InstructBean instructBean = new InstructBean();
        instructBean.setType(ContentType.TEXT_TITLE);
        instructBean.setTextContentRes(i8);
        instructBean.setTextColorRes(R$color.assist_14);
        instructBean.setTextSize(17);
        instructBean.setBottomMargin(12);
        instructBean.setHorizontalMargin(20);
        list.add(instructBean);
    }

    public static void addVideoViewBean(List<InstructBean> list, int i8, int... iArr) {
        InstructBean instructBean = new InstructBean();
        instructBean.setType(ContentType.VIDEO);
        instructBean.setVideoRes(convertIntArrayToList(iArr));
        instructBean.setBottomMargin(i8);
        list.add(instructBean);
    }

    private static List<Integer> convertIntArrayToList(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    private static ImageView covertImageview(Context context, InstructBean instructBean) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(instructBean.getImageRes());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dpToPx(instructBean.getBottomMargin());
        layoutParams.rightMargin = dpToPx(instructBean.getHorizontalMargin());
        layoutParams.leftMargin = dpToPx(instructBean.getHorizontalMargin());
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(instructBean.getImageRes());
        return imageView;
    }

    private static TextView covertTextview(Context context, InstructBean instructBean) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dpToPx(instructBean.getTopMargin());
        layoutParams.bottomMargin = dpToPx(instructBean.getBottomMargin());
        layoutParams.leftMargin = dpToPx(instructBean.getHorizontalMargin());
        layoutParams.rightMargin = dpToPx(instructBean.getHorizontalMargin());
        textView.setLayoutParams(layoutParams);
        textView.setTypeface(instructBean.getType().equals(ContentType.TEXT_TITLE) ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        textView.setText(instructBean.getTextContentRes());
        setHighlightText(textView, instructBean.getTextContentRes(), instructBean.getTextColorRes());
        textView.setTextSize(instructBean.getTextSize());
        return textView;
    }

    private static VideoPagerComponent covertVideoView(Context context, InstructBean instructBean) {
        VideoPagerComponent videoPagerComponent = new VideoPagerComponent(context, UriParses(context, instructBean.getVideoRes()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dpToPx(instructBean.getBottomMargin());
        videoPagerComponent.setLayoutParams(layoutParams);
        return videoPagerComponent;
    }

    public static int dpToPx(int i8) {
        return Math.round(i8 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static void fillLayout(LinearLayout linearLayout, List<InstructBean> list) {
        for (InstructBean instructBean : list) {
            int i8 = a.$SwitchMap$com$moyoung$instructions$utils$ContentType[instructBean.getType().ordinal()];
            if (i8 == 1 || i8 == 2) {
                linearLayout.addView(covertTextview(linearLayout.getContext(), instructBean));
            } else if (i8 == 3) {
                ImageView covertImageview = covertImageview(linearLayout.getContext(), instructBean);
                linearLayout.addView(covertImageview);
                setClickToEnlarge(covertImageview);
            } else if (i8 == 4) {
                linearLayout.addView(covertVideoView(linearLayout.getContext(), instructBean));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setClickToEnlarge$0(Dialog dialog, View view, View view2) {
        dialog.dismiss();
        view.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setClickToEnlarge$1(ImageView imageView, final View view) {
        view.setEnabled(false);
        Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        final Dialog dialog = new Dialog(imageView.getContext());
        ImageView imageView2 = new ImageView(imageView.getContext());
        imageView2.setImageBitmap(bitmap);
        dialog.setContentView(imageView2);
        if (dialog.getWindow() == null) {
            return;
        }
        dialog.getWindow().setLayout(-1, -1);
        dialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
        dialog.show();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.instructions.utils.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.lambda$setClickToEnlarge$0(dialog, view, view2);
            }
        });
    }

    private static void processHighlightedText(SpannableStringBuilder spannableStringBuilder, String str, int i8) {
        String substring = str.substring(3, str.length() - 4);
        SpannableString spannableString = new SpannableString(substring);
        spannableString.setSpan(new ForegroundColorSpan(i8), 0, substring.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    private static void processNormalText(SpannableStringBuilder spannableStringBuilder, String str, int i8) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i8), 0, str.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    private static SpannableStringBuilder processTextWithColors(String str, int i8, int i9) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (String str2 : str.split("(?=<p>)|(?<=</p>)")) {
            if (str2.startsWith(TAG) && str2.endsWith(END_TAG)) {
                processHighlightedText(spannableStringBuilder, str2, i9);
            } else {
                processNormalText(spannableStringBuilder, str2, i8);
            }
        }
        return spannableStringBuilder;
    }

    private static void setClickToEnlarge(final ImageView imageView) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.instructions.utils.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.lambda$setClickToEnlarge$1(imageView, view);
            }
        });
    }

    private static void setHighlightText(TextView textView, @StringRes int i8, @ColorRes int i9) {
        Context context = textView.getContext();
        textView.setText(processTextWithColors(context.getString(i8), ContextCompat.getColor(context, i9), ContextCompat.getColor(context, HIGH_LIGHT_TEXT)));
    }

    static void addTitleTextviewBean(List<InstructBean> list, int i8, int i9, int i10) {
        InstructBean instructBean = new InstructBean();
        instructBean.setType(ContentType.TEXT_TITLE);
        instructBean.setTextContentRes(i8);
        instructBean.setTextColorRes(R$color.assist_14);
        instructBean.setTextSize(17);
        instructBean.setBottomMargin(i9);
        instructBean.setTopMargin(i10);
        instructBean.setHorizontalMargin(20);
        list.add(instructBean);
    }
}
