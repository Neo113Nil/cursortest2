package com.linecorp.linesdk;

import android.content.Intent;
import com.linecorp.linesdk.internal.LoginDelegateImpl;

/* loaded from: classes2.dex */
public interface LoginDelegate {

    public static class Factory {
        public static LoginDelegate create() {
            return new LoginDelegateImpl();
        }
    }

    boolean onActivityResult(int i4, int i5, Intent intent);
}
