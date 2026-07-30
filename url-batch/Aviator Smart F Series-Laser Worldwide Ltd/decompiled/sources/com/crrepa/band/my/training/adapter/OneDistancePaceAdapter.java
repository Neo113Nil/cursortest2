package com.crrepa.band.my.training.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.text.TextUtilsCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.utils.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class OneDistancePaceAdapter extends BaseQuickAdapter<b, BaseViewHolder> {
    private final String distanceUnit;
    private final float fastestDuration;
    private final float lowestDuration;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ProgressBar val$progressBar;
        final /* synthetic */ TextView val$tvProgress;

        a(ProgressBar progressBar, TextView textView) {
            this.val$progressBar = progressBar;
            this.val$tvProgress = textView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            float width;
            this.val$progressBar.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            float width2 = this.val$progressBar.getWidth();
            float progress = (this.val$progressBar.getProgress() / this.val$progressBar.getMax()) * width2;
            if (OneDistancePaceAdapter.isRtl()) {
                width = (width2 - progress) + 5.0f;
            } else {
                width = (progress - this.val$tvProgress.getWidth()) - 5.0f;
                if (width < 50.0f) {
                    width = 50.0f;
                }
            }
            this.val$tvProgress.setX(width);
        }
    }

    public static class b {
        String index;
        boolean isLastOne;
        int pace;

        public b(String str, int i8, boolean z7) {
            this.index = str;
            this.pace = i8;
            this.isLastOne = z7;
        }
    }

    public OneDistancePaceAdapter(Context context, List<Float> list) {
        super(R.layout.item_gps_training_one_distance_pace);
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.size() > 1) {
            arrayList.remove(arrayList.size() - 1);
        }
        this.lowestDuration = ((Float) Collections.max(arrayList)).floatValue();
        this.fastestDuration = ((Float) Collections.min(arrayList)).floatValue();
        if (BandUnitSystemProvider.isImperialSystem()) {
            this.distanceUnit = context.getString(R.string.distance_unit_miles);
        } else {
            this.distanceUnit = context.getString(R.string.distance_unit_km);
        }
    }

    public static List<b> createOneDistancePaceList(List<Float> list) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < list.size()) {
            int i9 = i8 + 1;
            String valueOf = String.valueOf(i9);
            int intValue = list.get(i8).intValue();
            boolean z7 = true;
            if (i8 != list.size() - 1) {
                z7 = false;
            }
            arrayList.add(new b(valueOf, intValue, z7));
            i8 = i9;
        }
        return arrayList;
    }

    public static boolean isRtl() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    private static void showTvTranslationX(ProgressBar progressBar, TextView textView) {
        progressBar.getViewTreeObserver().addOnGlobalLayoutListener(new a(progressBar, textView));
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private void updateProgressBar(b bVar, ProgressBar progressBar) {
        if (bVar.isLastOne) {
            progressBar.setProgressDrawable(progressBar.getContext().getDrawable(R.drawable.progressbar_pace_miles_last));
        } else if (this.fastestDuration == bVar.pace) {
            progressBar.setProgressDrawable(progressBar.getContext().getDrawable(R.drawable.progressbar_pace_miles_fastest));
        } else {
            progressBar.setProgressDrawable(progressBar.getContext().getDrawable(R.drawable.progressbar_pace_miles));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public void convert(@NonNull BaseViewHolder baseViewHolder, b bVar) {
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_index);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_progress);
        ProgressBar progressBar = (ProgressBar) baseViewHolder.getView(R.id.pb);
        int i8 = bVar.pace;
        textView.setText(bVar.index);
        progressBar.setMax((int) this.lowestDuration);
        progressBar.setProgress(i8);
        updateProgressBar(bVar, progressBar);
        String paceStrBySeconds = c.getPaceStrBySeconds(i8);
        if (bVar.isLastOne) {
            progressBar.setProgress(progressBar.getMax());
            textView2.setTextColor(textView2.getContext().getResources().getColor(R.color.assist_9_99));
            textView.setTextColor(textView2.getContext().getResources().getColor(R.color.assist_9_99));
            textView2.setText(progressBar.getContext().getString(R.string.gps_result_speed_desc_text, this.distanceUnit, paceStrBySeconds));
        } else {
            textView2.setText(paceStrBySeconds);
            textView2.setTextColor(textView2.getContext().getResources().getColor(R.color.assist_1_ff));
            textView.setTextColor(textView2.getContext().getResources().getColor(R.color.assist_1_ff));
        }
        showTvTranslationX(progressBar, textView2);
    }
}
