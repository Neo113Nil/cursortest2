package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public abstract class g03 extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private h03 f5405a;

    /* renamed from: b, reason: collision with root package name */
    protected final yz2 f5406b;

    public g03(yz2 yz2Var, byte[] bArr) {
        this.f5406b = yz2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        h03 h03Var = this.f5405a;
        if (h03Var != null) {
            h03Var.a(this);
        }
    }

    public final void b(h03 h03Var) {
        this.f5405a = h03Var;
    }
}
