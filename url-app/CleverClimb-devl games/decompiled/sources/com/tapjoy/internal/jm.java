package com.tapjoy.internal;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

/* loaded from: classes2.dex */
public final class jm {

    /* renamed from: a, reason: collision with root package name */
    final String f8466a;

    /* renamed from: b, reason: collision with root package name */
    final CharSequence f8467b;

    /* renamed from: c, reason: collision with root package name */
    final CharSequence[] f8468c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f8469d;
    final Bundle e;
    final Set f;

    static RemoteInput[] a(jm[] jmVarArr) {
        if (jmVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[jmVarArr.length];
        for (int i = 0; i < jmVarArr.length; i++) {
            jm jmVar = jmVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(jmVar.f8466a).setLabel(jmVar.f8467b).setChoices(jmVar.f8468c).setAllowFreeFormInput(jmVar.f8469d).addExtras(jmVar.e).build();
        }
        return remoteInputArr;
    }
}
