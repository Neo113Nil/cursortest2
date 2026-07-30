package com.moyoung.dafit.module.common.utils;

import android.R;
import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class t0 {
    @RequiresApi(api = 21)
    private static void addNonNullViewToTransitionParticipants(View view, List<Pair> list) {
        if (view == null) {
            return;
        }
        list.add(new Pair(view, view.getTransitionName()));
    }

    @RequiresApi(api = 21)
    public static Pair<View, String>[] createSafeTransitionParticipants(@NonNull Activity activity, boolean z7, @Nullable Pair... pairArr) {
        View decorView = activity.getWindow().getDecorView();
        View findViewById = z7 ? decorView.findViewById(R.id.statusBarBackground) : null;
        View findViewById2 = decorView.findViewById(R.id.navigationBarBackground);
        ArrayList arrayList = new ArrayList(3);
        addNonNullViewToTransitionParticipants(findViewById, arrayList);
        addNonNullViewToTransitionParticipants(findViewById2, arrayList);
        if (pairArr != null && (pairArr.length != 1 || pairArr[0] != null)) {
            arrayList.addAll(Arrays.asList(pairArr));
        }
        return (Pair[]) arrayList.toArray(new Pair[arrayList.size()]);
    }
}
