package com.winfour.winrandom.ui;

import N0.ViewOnClickListenerC0028a;
import R0.c;
import S0.b;
import U0.e;
import V0.d;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.winfour.winrandom.R;
import com.winfour.winrandom.ui.HistoryActivity;
import g.AbstractActivityC0106i;
import g1.InterfaceC0110a;
import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class HistoryActivity extends AbstractActivityC0106i {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f2109B = 0;

    /* renamed from: A, reason: collision with root package name */
    public final e f2110A = new e();

    /* renamed from: y, reason: collision with root package name */
    public final d f2111y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2112z;

    public HistoryActivity() {
        final int i = 0;
        this.f2111y = new d(new InterfaceC0110a(this) { // from class: U0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HistoryActivity f876b;

            {
                this.f876b = this;
            }

            @Override // g1.InterfaceC0110a
            public final Object b() {
                HistoryActivity historyActivity = this.f876b;
                switch (i) {
                    case 0:
                        int i2 = HistoryActivity.f2109B;
                        View inflate = historyActivity.getLayoutInflater().inflate(R.layout.activity_history, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.emptyView;
                            TextView textView = (TextView) AbstractC0112a.h(inflate, R.id.emptyView);
                            if (textView != null) {
                                i3 = R.id.historyList;
                                RecyclerView recyclerView = (RecyclerView) AbstractC0112a.h(inflate, R.id.historyList);
                                if (recyclerView != null) {
                                    return new S0.b((LinearLayout) inflate, materialButton, textView, recyclerView);
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HistoryActivity.f2109B;
                        return new R0.c(historyActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2112z = new d(new InterfaceC0110a(this) { // from class: U0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HistoryActivity f876b;

            {
                this.f876b = this;
            }

            @Override // g1.InterfaceC0110a
            public final Object b() {
                HistoryActivity historyActivity = this.f876b;
                switch (i2) {
                    case 0:
                        int i22 = HistoryActivity.f2109B;
                        View inflate = historyActivity.getLayoutInflater().inflate(R.layout.activity_history, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.emptyView;
                            TextView textView = (TextView) AbstractC0112a.h(inflate, R.id.emptyView);
                            if (textView != null) {
                                i3 = R.id.historyList;
                                RecyclerView recyclerView = (RecyclerView) AbstractC0112a.h(inflate, R.id.historyList);
                                if (recyclerView != null) {
                                    return new S0.b((LinearLayout) inflate, materialButton, textView, recyclerView);
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HistoryActivity.f2109B;
                        return new R0.c(historyActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f2111y;
        setContentView(((b) dVar.a()).f807a);
        ((b) dVar.a()).f808b.setOnClickListener(new ViewOnClickListenerC0028a(3, this));
        ((b) dVar.a()).d.setLayoutManager(new LinearLayoutManager(1));
        ((b) dVar.a()).d.setAdapter(this.f2110A);
        t();
    }

    @Override // g.AbstractActivityC0106i, android.app.Activity
    public final void onResume() {
        super.onResume();
        t();
    }

    public final void t() {
        List a2 = ((c) this.f2112z.a()).a();
        e eVar = this.f2110A;
        eVar.getClass();
        ArrayList arrayList = eVar.d;
        arrayList.clear();
        arrayList.addAll(a2);
        eVar.f2383a.b();
        ((b) this.f2111y.a()).f809c.setVisibility(a2.isEmpty() ? 0 : 8);
    }
}
