package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fqw implements AdapterView.OnItemClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fqw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        CharSequence convertSelectionToString;
        if (this.b != 0) {
            Object obj = this.a;
            il ilVar = (il) obj;
            io ioVar = ilVar.d;
            ioVar.setSelection(i);
            if (ioVar.getOnItemClickListener() != null) {
                ioVar.performItemClick(view, i, ilVar.b.getItemId(i));
            }
            ((ki) obj).m();
            return;
        }
        Object obj2 = this.a;
        if (i < 0) {
            ki kiVar = ((fqy) obj2).a;
            item = !kiVar.x() ? null : kiVar.e.getSelectedItem();
        } else {
            item = ((fqy) obj2).getAdapter().getItem(i);
        }
        fqy fqyVar = (fqy) this.a;
        convertSelectionToString = fqyVar.convertSelectionToString(item);
        fqyVar.setText(convertSelectionToString, false);
        AdapterView.OnItemClickListener onItemClickListener = fqyVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                ki kiVar2 = fqyVar.a;
                view = !kiVar2.x() ? null : kiVar2.e.getSelectedView();
                i = kiVar2.o();
                j = !kiVar2.x() ? Long.MIN_VALUE : kiVar2.e.getSelectedItemId();
            }
            onItemClickListener.onItemClick(fqyVar.a.e, view, i, j);
        }
        fqyVar.a.m();
    }
}
