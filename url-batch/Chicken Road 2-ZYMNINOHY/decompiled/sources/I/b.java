package I;

import android.database.DataSetObserver;
import k.AbstractC1185I;
import k.ViewOnClickListenerC1209d0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1111b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f1110a = i4;
        this.f1111b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1110a) {
            case 0:
                ViewOnClickListenerC1209d0 viewOnClickListenerC1209d0 = (ViewOnClickListenerC1209d0) this.f1111b;
                viewOnClickListenerC1209d0.f1112a = true;
                viewOnClickListenerC1209d0.notifyDataSetChanged();
                break;
            default:
                AbstractC1185I abstractC1185I = (AbstractC1185I) this.f1111b;
                if (abstractC1185I.v.isShowing()) {
                    abstractC1185I.show();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1110a) {
            case 0:
                ViewOnClickListenerC1209d0 viewOnClickListenerC1209d0 = (ViewOnClickListenerC1209d0) this.f1111b;
                viewOnClickListenerC1209d0.f1112a = false;
                viewOnClickListenerC1209d0.notifyDataSetInvalidated();
                break;
            default:
                ((AbstractC1185I) this.f1111b).dismiss();
                break;
        }
    }
}
