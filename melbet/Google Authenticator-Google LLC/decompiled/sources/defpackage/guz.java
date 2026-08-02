package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class guz implements TextWatcher {
    final /* synthetic */ gva a;
    final /* synthetic */ TextWatcher b;

    public guz(gva gvaVar, TextWatcher textWatcher) {
        this.a = gvaVar;
        this.b = textWatcher;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (hoq.aI()) {
            ixf.j(this.a.f("SearchBarClearcutLog", 32), null);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        TextWatcher textWatcher = this.b;
        if (!hoq.aI()) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
            return;
        }
        gtt f = this.a.f("SearchBarClearcutLog", 32);
        try {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        TextWatcher textWatcher = this.b;
        if (!hoq.aI()) {
            textWatcher.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        gtt f = this.a.f("SearchBarClearcutLog", 32);
        try {
            textWatcher.onTextChanged(charSequence, i, i2, i3);
            ixf.j(f, null);
        } finally {
        }
    }
}
