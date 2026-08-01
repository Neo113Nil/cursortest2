package com.google.android.material.datepicker;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.oriondriftchasers.arordrft.R;
import l.y2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f922g;

    public /* synthetic */ l(int i, Object obj) {
        this.f921f = i;
        this.f922g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f921f) {
            case 0:
                m mVar = (m) this.f922g;
                int i = mVar.f925c0;
                if (i != 2) {
                    if (i == 1) {
                        mVar.H(2);
                        mVar.f926e0.announceForAccessibility(mVar.C().getResources().getString(R.string.mtrl_picker_toggled_to_year_selection));
                        break;
                    }
                } else {
                    mVar.H(1);
                    mVar.f927f0.announceForAccessibility(mVar.C().getResources().getString(R.string.mtrl_picker_toggled_to_day_selection));
                    break;
                }
                break;
            case 1:
                g.e eVar = (g.e) this.f922g;
                eVar.f1626v.obtainMessage(1, eVar.f1608b).sendToTarget();
                break;
            case 2:
                k.o itemData = ((g2.f) view).getItemData();
                t1.b bVar = (t1.b) this.f922g;
                boolean q3 = bVar.R.f1748a.q(itemData, bVar.Q, 0);
                if (itemData != null && itemData.isCheckable()) {
                    if (!q3 || itemData.isChecked()) {
                        bVar.setCheckedItem(itemData);
                        break;
                    }
                }
                break;
            case 3:
                ((j.a) this.f922g).a();
                break;
            default:
                y2 y2Var = ((Toolbar) this.f922g).Q;
                k.o oVar = y2Var == null ? null : y2Var.f2522g;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
