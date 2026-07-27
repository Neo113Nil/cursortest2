package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;
import w2.m;

/* loaded from: classes.dex */
public final class e extends BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f10168a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, g gVar) {
        super(mVar, true);
        this.f10168a = gVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f10168a;
    }
}
