package io.flutter.plugin.editing;

import E.v;
import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;

/* loaded from: classes.dex */
public final class e extends BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v vVar, g gVar) {
        super(vVar, true);
        this.f647a = gVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f647a;
    }
}
