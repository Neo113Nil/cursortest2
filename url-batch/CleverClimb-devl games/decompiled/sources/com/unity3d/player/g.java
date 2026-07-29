package com.unity3d.player;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class g extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f9359a;

    public g() {
        this.f9359a = null;
    }

    public g(Runnable runnable) {
        this.f9359a = runnable;
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f9359a == null) {
            getFragmentManager().beginTransaction().remove(this).commit();
        } else {
            requestPermissions(getArguments().getStringArray("PermissionNames"), 15881);
        }
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 15881) {
            return;
        }
        for (int i2 = 0; i2 < strArr.length && i2 < iArr.length; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strArr[i2]);
            sb.append(iArr[i2] == 0 ? " granted" : " denied");
            e.Log(4, sb.toString());
        }
        FragmentTransaction beginTransaction = getActivity().getFragmentManager().beginTransaction();
        beginTransaction.remove(this);
        beginTransaction.commit();
        this.f9359a.run();
    }
}
