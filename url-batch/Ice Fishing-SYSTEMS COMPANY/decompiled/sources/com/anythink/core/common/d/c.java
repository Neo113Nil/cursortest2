package com.anythink.core.common.d;

import android.util.Log;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.AdError;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class c {
    WeakReference<ATAdSourceStatusListener> adSourceEventListenerRef;

    /* JADX INFO: Access modifiers changed from: private */
    public ATAdSourceStatusListener getAdSourceStatusListener() {
        WeakReference<ATAdSourceStatusListener> weakReference = this.adSourceEventListenerRef;
        if (weakReference == null) {
            return null;
        }
        ATAdSourceStatusListener aTAdSourceStatusListener = weakReference.get();
        if (aTAdSourceStatusListener == null) {
            Log.e("anythink", "ATAdSourceStatusListener had been released.");
        }
        return aTAdSourceStatusListener;
    }

    public void onAdSourceAttempt(com.anythink.core.common.h.n nVar) {
        final l a9 = l.a(nVar, (f) null, 2);
        t.b().b(new Runnable() { // from class: com.anythink.core.common.d.c.4
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener adSourceStatusListener = c.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceAttempt(a9);
                }
            }
        });
    }

    public void onAdSourceBiddingAttempt(com.anythink.core.common.h.n nVar) {
        final l a9 = l.a(nVar, (f) null);
        t.b().b(new Runnable() { // from class: com.anythink.core.common.d.c.1
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener adSourceStatusListener = c.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceBiddingAttempt(a9);
                }
            }
        });
    }

    public void onAdSourceBiddingFail(com.anythink.core.common.h.n nVar, final AdError adError) {
        final l a9 = l.a(nVar, (f) null);
        t.b().b(new Runnable() { // from class: com.anythink.core.common.d.c.3
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener adSourceStatusListener = c.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceBiddingFail(a9, adError);
                }
            }
        });
    }

    public void onAdSourceBiddingFilled(com.anythink.core.common.h.n nVar) {
        final l a9 = l.a(nVar, (f) null, 1);
        t.b().b(new Runnable() { // from class: com.anythink.core.common.d.c.2
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener adSourceStatusListener = c.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceBiddingFilled(a9);
                }
            }
        });
    }

    public void onAdSourceLoadFail(com.anythink.core.common.h.n nVar, final AdError adError) {
        final l a9 = l.a(nVar, (f) null, 3);
        t.b().b(new Runnable() { // from class: com.anythink.core.common.d.c.6
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener adSourceStatusListener = c.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceLoadFail(a9, adError);
                }
            }
        });
    }

    public void onAdSourceLoadFilled(com.anythink.core.common.h.n nVar) {
        final l a9 = l.a(nVar, (f) null, 3);
        t.b().b(new Runnable() { // from class: com.anythink.core.common.d.c.5
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener adSourceStatusListener = c.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceLoadFilled(a9);
                }
            }
        });
    }

    public void setAdSourceStatusListener(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (aTAdSourceStatusListener == null) {
            return;
        }
        this.adSourceEventListenerRef = new WeakReference<>(aTAdSourceStatusListener);
    }
}
