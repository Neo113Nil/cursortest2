package com.facebook.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import defpackage.fr0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FragmentWrapper {
    private Fragment nativeFragment;
    private fr0 supportFragment;

    public FragmentWrapper(fr0 fr0Var) {
        fr0Var.getClass();
        this.supportFragment = fr0Var;
    }

    public final Activity getActivity() {
        fr0 fr0Var = this.supportFragment;
        if (fr0Var != null) {
            if (fr0Var != null) {
                return fr0Var.getActivity();
            }
            return null;
        }
        Fragment fragment = this.nativeFragment;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    public final Fragment getNativeFragment() {
        return this.nativeFragment;
    }

    public final fr0 getSupportFragment() {
        return this.supportFragment;
    }

    public final void startActivityForResult(Intent intent, int i) {
        fr0 fr0Var = this.supportFragment;
        if (fr0Var != null) {
            if (fr0Var != null) {
                fr0Var.startActivityForResult(intent, i);
            }
        } else {
            Fragment fragment = this.nativeFragment;
            if (fragment != null) {
                fragment.startActivityForResult(intent, i);
            }
        }
    }

    public FragmentWrapper(Fragment fragment) {
        fragment.getClass();
        this.nativeFragment = fragment;
    }
}
