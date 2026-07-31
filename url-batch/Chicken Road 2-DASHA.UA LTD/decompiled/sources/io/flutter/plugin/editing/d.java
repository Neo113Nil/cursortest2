package io.flutter.plugin.editing;

import D.y;
import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;

/* loaded from: classes.dex */
public final class d extends BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f592a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, f fVar) {
        super(yVar, true);
        this.f592a = fVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f592a;
    }
}
