package com.google.android.material.datepicker;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.oriondriftchasers.arordrft.MainMenuActivityHub;
import com.oriondriftchasers.arordrft.WelcomeActivityScreen;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f934g;

    public /* synthetic */ n(int i, Object obj) {
        this.f933f = i;
        this.f934g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f933f;
        Object obj = this.f934g;
        switch (i) {
            case 0:
                ((p) obj).H();
                throw null;
            case 1:
                o2.d dVar = (o2.d) obj;
                EditText editText = dVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.p();
                return;
            case 2:
                ((o2.k) obj).t();
                return;
            case 3:
                o2.v vVar = (o2.v) obj;
                EditText editText2 = vVar.f2975f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = vVar.f2975f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    vVar.f2975f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    vVar.f2975f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    vVar.f2975f.setSelection(selectionEnd);
                }
                vVar.p();
                return;
            default:
                WelcomeActivityScreen welcomeActivityScreen = (WelcomeActivityScreen) obj;
                int i4 = WelcomeActivityScreen.F;
                welcomeActivityScreen.startActivity(new Intent(welcomeActivityScreen, (Class<?>) MainMenuActivityHub.class));
                welcomeActivityScreen.finish();
                return;
        }
    }
}
