package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e extends BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f443a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, g gVar) {
        super(view, true);
        this.f443a = gVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f443a;
    }
}
