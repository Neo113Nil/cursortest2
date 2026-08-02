package io.flutter.embedding.android;

import android.view.View;

/* loaded from: classes.dex */
class FlutterMeasureSpec {

    public interface MeasureCallback {
        void onMeasure(int i4, int i5);
    }

    public static void onMeasure(int i4, int i5, MeasureCallback measureCallback) {
        int mode = View.MeasureSpec.getMode(i4);
        measureCallback.onMeasure(Math.max(View.MeasureSpec.getSize(i4), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i5), View.MeasureSpec.getMode(i5) == 0 ? 1 : 0));
    }
}
