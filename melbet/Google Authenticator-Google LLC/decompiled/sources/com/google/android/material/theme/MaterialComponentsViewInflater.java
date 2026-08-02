package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.fgs;
import defpackage.fmi;
import defpackage.fqy;
import defpackage.frh;
import defpackage.hr;
import defpackage.ht;
import defpackage.hu;
import defpackage.id;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final hr a(Context context, AttributeSet attributeSet) {
        return new fqy(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final ht b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final hu c(Context context, AttributeSet attributeSet) {
        return new fgs(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final id d(Context context, AttributeSet attributeSet) {
        return new fmi(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new frh(context, attributeSet);
    }
}
