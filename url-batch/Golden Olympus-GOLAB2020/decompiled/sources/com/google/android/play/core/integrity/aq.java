package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final class aq extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f13511a;

    /* renamed from: b, reason: collision with root package name */
    private final y f13512b;

    aq(String str, y yVar) {
        this.f13511a = str;
        this.f13512b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i4) {
        return this.f13512b.a(activity, i4);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f13511a;
    }
}
