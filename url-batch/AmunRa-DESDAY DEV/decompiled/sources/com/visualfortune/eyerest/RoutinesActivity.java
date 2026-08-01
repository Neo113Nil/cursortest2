package com.visualfortune.eyerest;

import L0.ViewOnClickListenerC0025a;
import O0.i;
import O0.o;
import Q0.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.visualfortune.eyerest.RoutinesActivity;
import com.visualfortune.eyerest.SessionActivity;
import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final class RoutinesActivity extends AbstractActivityC0131i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1935z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f1936y = new d(new O0.d(this, 1));

    @Override // g.AbstractActivityC0131i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f1936y;
        setContentView(((P0.d) dVar.a()).f647a);
        ((P0.d) dVar.a()).f648b.setOnClickListener(new ViewOnClickListenerC0025a(4, this));
        ((P0.d) dVar.a()).f649c.removeAllViews();
        LayoutInflater layoutInflater = getLayoutInflater();
        Z0.d.d(layoutInflater, "getLayoutInflater(...)");
        for (final i iVar : o.f637a) {
            View inflate = layoutInflater.inflate(R.layout.item_routine, (ViewGroup) ((P0.d) dVar.a()).f649c, false);
            ((TextView) inflate.findViewById(R.id.routineName)).setText(getString(iVar.f623b));
            ((TextView) inflate.findViewById(R.id.routineDesc)).setText(getString(iVar.f624c));
            ((TextView) inflate.findViewById(R.id.routineDuration)).setText(getString(R.string.routine_duration, Integer.valueOf(iVar.d / 60)));
            inflate.setOnClickListener(new View.OnClickListener() { // from class: O0.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = RoutinesActivity.f1935z;
                    RoutinesActivity routinesActivity = RoutinesActivity.this;
                    routinesActivity.startActivity(new Intent(routinesActivity, (Class<?>) SessionActivity.class).putExtra("routine", iVar.f622a));
                }
            });
            ((P0.d) dVar.a()).f649c.addView(inflate);
        }
    }
}
