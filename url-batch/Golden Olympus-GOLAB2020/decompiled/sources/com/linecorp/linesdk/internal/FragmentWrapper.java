package com.linecorp.linesdk.internal;

import android.app.Fragment;
import android.content.Intent;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class FragmentWrapper {
    private Fragment fragment;
    private androidx.fragment.app.Fragment supportFragment;

    public FragmentWrapper(@NonNull Fragment fragment) {
        this.fragment = fragment;
    }

    public void startActivityForResult(Intent intent, int i4) {
        Fragment fragment = this.fragment;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i4);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.supportFragment;
        if (fragment2 != null) {
            fragment2.startActivityForResult(intent, i4);
        }
    }

    public FragmentWrapper(@NonNull androidx.fragment.app.Fragment fragment) {
        this.supportFragment = fragment;
    }
}
