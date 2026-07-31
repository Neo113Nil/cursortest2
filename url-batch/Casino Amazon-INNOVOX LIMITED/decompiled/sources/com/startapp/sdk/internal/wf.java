package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class wf {

    /* renamed from: a, reason: collision with root package name */
    public static String f484a;
    public static final AtomicBoolean b = new AtomicBoolean(true);

    public static String a(Context context) {
        if (b.getAndSet(false)) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.startapp.sdk.internal.wf$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        wf.f484a = ((AppSetIdInfo) obj).getId();
                    }
                });
            } catch (GooglePlayServicesMissingManifestValueException | NoClassDefFoundError unused) {
            }
        }
        return f484a;
    }
}
