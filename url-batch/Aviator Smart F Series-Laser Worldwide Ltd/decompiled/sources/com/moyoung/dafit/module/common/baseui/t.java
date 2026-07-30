package com.moyoung.dafit.module.common.baseui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class t {
    private a callback;
    private final Context context;
    private int requestCode;

    public interface a {
    }

    public t(Context context) {
        this.context = context;
    }

    public void goPermissionSetting() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.context.getPackageName(), null));
        try {
            this.context.startActivity(intent);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public boolean hasPermission(@NonNull String str) {
        return ContextCompat.checkSelfPermission(this.context, str) == 0;
    }

    public boolean hasPermissions(@NonNull String[] strArr) {
        for (String str : strArr) {
            if (withoutPermission(str)) {
                return false;
            }
        }
        return true;
    }

    public void onResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i8 != this.requestCode) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < iArr.length; i9++) {
            if (iArr[i9] != 0) {
                arrayList.add(strArr[i9]);
            }
        }
        if (!arrayList.isEmpty()) {
            throw null;
        }
        throw null;
    }

    public void requestPermissions(Activity activity, @NonNull String[] strArr, int i8, a aVar) {
        this.requestCode = i8;
        if (Build.VERSION.SDK_INT >= 23) {
            activity.requestPermissions(strArr, i8);
        } else {
            ActivityCompat.requestPermissions(activity, strArr, i8);
        }
    }

    public boolean withoutPermission(@NonNull String str) {
        return ContextCompat.checkSelfPermission(this.context, str) != 0;
    }

    public void requestPermissions(Fragment fragment, @NonNull String[] strArr, int i8, a aVar) {
        this.requestCode = i8;
        if (Build.VERSION.SDK_INT >= 23) {
            fragment.requestPermissions(strArr, i8);
        } else {
            ActivityCompat.requestPermissions(fragment.requireActivity(), strArr, i8);
        }
    }
}
