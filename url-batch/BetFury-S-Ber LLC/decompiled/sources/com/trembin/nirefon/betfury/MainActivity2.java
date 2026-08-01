package com.trembin.nirefon.betfury;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.trembin.nirefon.betfury.data.NoteDatabase;
import com.trembin.nirefon.betfury.databinding.ActivityMain2Binding;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;
import defpackage.aw;
import defpackage.b2;
import defpackage.b90;
import defpackage.bi;
import defpackage.bo0;
import defpackage.c2;
import defpackage.c40;
import defpackage.dc;
import defpackage.gb0;
import defpackage.gx;
import defpackage.hc;
import defpackage.jb0;
import defpackage.jx;
import defpackage.jz;
import defpackage.kz;
import defpackage.lz;
import defpackage.mv;
import defpackage.n9;
import defpackage.nx;
import defpackage.nz;
import defpackage.o0;
import defpackage.ry;
import defpackage.s9;
import defpackage.sy;
import defpackage.ty;
import defpackage.u3;
import defpackage.v4;
import defpackage.wd;
import defpackage.wi;
import defpackage.wi0;
import defpackage.wv;
import defpackage.x1;
import defpackage.x80;
import defpackage.xv;
import defpackage.zv;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class MainActivity2 extends u3 {
    public static final /* synthetic */ int I = 0;
    public ActivityMain2Binding F;
    public NotesViewModel G;
    public final c2 H;

    public MainActivity2() {
        final x1 x1Var = new x1(1);
        final s9 s9Var = new s9(17);
        final wd wdVar = this.n;
        wdVar.getClass();
        final String str = "activity_rq#" + this.m.getAndIncrement();
        LinkedHashMap linkedHashMap = wdVar.c;
        nx nxVar = this.f;
        if (nxVar.c.isAtLeast(gx.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            gx gxVar = nxVar.c;
            sb.append(" is attempting to register while current state is ");
            sb.append(gxVar);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        wdVar.d(str);
        b2 b2Var = (b2) linkedHashMap.get(str);
        b2Var = b2Var == null ? new b2(nxVar) : b2Var;
        jx jxVar = new jx() { // from class: y1
            @Override // defpackage.jx
            public final void i(lx lxVar, fx fxVar) {
                fx fxVar2 = fx.ON_START;
                wd wdVar2 = wd.this;
                String str2 = str;
                if (fxVar2 != fxVar) {
                    if (fx.ON_STOP == fxVar) {
                        wdVar2.e.remove(str2);
                        return;
                    } else {
                        if (fx.ON_DESTROY == fxVar) {
                            wdVar2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = wdVar2.e;
                Bundle bundle = wdVar2.g;
                LinkedHashMap linkedHashMap3 = wdVar2.f;
                s9 s9Var2 = s9Var;
                x1 x1Var2 = x1Var;
                linkedHashMap2.put(str2, new a2(s9Var2, x1Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    s9Var2.a(obj);
                }
                v1 v1Var = (v1) n9.p(bundle, str2);
                if (v1Var != null) {
                    bundle.remove(str2);
                    s9Var2.a(x1Var2.H(v1Var.g, v1Var.f));
                }
            }
        };
        b2Var.a.a(jxVar);
        b2Var.b.add(jxVar);
        linkedHashMap.put(str, b2Var);
        this.H = new c2(wdVar, str, x1Var);
    }

    public final NotesViewModel l() {
        NotesViewModel notesViewModel = this.G;
        if (notesViewModel != null) {
            return notesViewModel;
        }
        mv.P("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.b, defpackage.yd, defpackage.xd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityMain2Binding inflate = ActivityMain2Binding.inflate(getLayoutInflater());
        inflate.getClass();
        this.F = inflate;
        setContentView(inflate.getRoot());
        ActivityMain2Binding activityMain2Binding = this.F;
        Object obj = null;
        if (activityMain2Binding == null) {
            mv.P("binding");
            throw null;
        }
        MaterialToolbar materialToolbar = activityMain2Binding.toolbar;
        v4 v4Var = (v4) k();
        int i = 1;
        if (v4Var.o instanceof Activity) {
            v4Var.A();
            n9 n9Var = v4Var.s;
            if (n9Var instanceof bo0) {
                s9.u("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            v4Var.t = null;
            if (n9Var != null) {
                n9Var.F();
            }
            v4Var.s = null;
            if (materialToolbar != null) {
                Object obj2 = v4Var.o;
                wi0 wi0Var = new wi0(materialToolbar, obj2 instanceof Activity ? ((Activity) obj2).getTitle() : v4Var.u, v4Var.r);
                v4Var.s = wi0Var;
                v4Var.r.g = wi0Var.u;
                materialToolbar.setBackInvokedCallbackEnabled(true);
            } else {
                v4Var.r.g = null;
            }
            v4Var.b();
        }
        NotificationChannel notificationChannel = new NotificationChannel("win_reminders", getString(R.string.channel_name), 4);
        notificationChannel.setDescription(getString(R.string.channel_desc));
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        if (Build.VERSION.SDK_INT >= 33 && bi.s(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            c2 c2Var = this.H;
            wd wdVar = c2Var.w;
            LinkedHashMap linkedHashMap = wdVar.b;
            ArrayList arrayList = wdVar.d;
            String str = c2Var.x;
            Object obj3 = linkedHashMap.get(str);
            x1 x1Var = c2Var.y;
            if (obj3 == null) {
                s9.s(x1Var, " and input android.permission.POST_NOTIFICATIONS. You must ensure the ActivityResultLauncher is registered before calling launch().", "Attempting to launch an unregistered ActivityResultLauncher with contract ");
                return;
            }
            int intValue = ((Number) obj3).intValue();
            arrayList.add(str);
            try {
                wdVar.b(intValue, x1Var);
            } catch (Exception e) {
                arrayList.remove(str);
                throw e;
            }
        }
        wi wiVar = new wi(d(), new kz(NoteDatabase.Companion.getDatabase(this).noteDao()), c());
        dc a = b90.a(NotesViewModel.class);
        String b = a.b();
        if (b == null) {
            s9.k("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.G = (NotesViewModel) wiVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        int i2 = 2;
        c40 c40Var = new c40(new jz(this, i), new jz(this, i2));
        ActivityMain2Binding activityMain2Binding2 = this.F;
        if (activityMain2Binding2 == null) {
            mv.P("binding");
            throw null;
        }
        activityMain2Binding2.recyclerView.setAdapter(c40Var);
        ActivityMain2Binding activityMain2Binding3 = this.F;
        if (activityMain2Binding3 == null) {
            mv.P("binding");
            throw null;
        }
        activityMain2Binding3.recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ActivityMain2Binding activityMain2Binding4 = this.F;
        if (activityMain2Binding4 == null) {
            mv.P("binding");
            throw null;
        }
        int i3 = 0;
        activityMain2Binding4.recyclerView.setHasFixedSize(false);
        aw awVar = new aw(new nz(c40Var, this));
        ActivityMain2Binding activityMain2Binding5 = this.F;
        if (activityMain2Binding5 == null) {
            mv.P("binding");
            throw null;
        }
        RecyclerView recyclerView = activityMain2Binding5.recyclerView;
        RecyclerView recyclerView2 = awVar.r;
        if (recyclerView2 != recyclerView) {
            wv wvVar = awVar.z;
            if (recyclerView2 != null) {
                recyclerView2.W(awVar);
                RecyclerView recyclerView3 = awVar.r;
                recyclerView3.u.remove(wvVar);
                if (recyclerView3.v == wvVar) {
                    recyclerView3.v = null;
                }
                ArrayList arrayList2 = awVar.r.G;
                if (arrayList2 != null) {
                    arrayList2.remove(awVar);
                }
                ArrayList arrayList3 = awVar.p;
                for (int size = arrayList3.size() - 1; size >= 0; size--) {
                    xv xvVar = (xv) arrayList3.get(0);
                    xvVar.g.cancel();
                    x80 x80Var = xvVar.e;
                    awVar.m.getClass();
                    nz.b(x80Var);
                }
                arrayList3.clear();
                awVar.w = null;
                VelocityTracker velocityTracker = awVar.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    awVar.t = null;
                }
                zv zvVar = awVar.y;
                if (zvVar != null) {
                    zvVar.a = false;
                    awVar.y = null;
                }
                if (awVar.x != null) {
                    awVar.x = null;
                }
            }
            awVar.r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                awVar.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                awVar.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                awVar.q = ViewConfiguration.get(awVar.r.getContext()).getScaledTouchSlop();
                awVar.r.g(awVar);
                awVar.r.u.add(wvVar);
                RecyclerView recyclerView4 = awVar.r;
                if (recyclerView4.G == null) {
                    recyclerView4.G = new ArrayList();
                }
                recyclerView4.G.add(awVar);
                awVar.y = new zv(awVar);
                awVar.x = new o0(awVar.r.getContext(), awVar.y);
            }
        }
        ActivityMain2Binding activityMain2Binding6 = this.F;
        if (activityMain2Binding6 == null) {
            mv.P("binding");
            throw null;
        }
        activityMain2Binding6.fab.setOnClickListener(new hc(i2, this));
        ty notes = l().getNotes();
        lz lzVar = new lz(new jz(this, i3), i3);
        notes.getClass();
        ty.a("observe");
        nx nxVar = this.f;
        if (nxVar.c == gx.DESTROYED) {
            return;
        }
        ry ryVar = new ry(notes, this, lzVar);
        jb0 jb0Var = notes.b;
        gb0 a2 = jb0Var.a(lzVar);
        if (a2 != null) {
            obj = a2.g;
        } else {
            gb0 gb0Var = new gb0(lzVar, ryVar);
            jb0Var.i++;
            gb0 gb0Var2 = jb0Var.g;
            if (gb0Var2 == null) {
                jb0Var.f = gb0Var;
                jb0Var.g = gb0Var;
            } else {
                gb0Var2.h = gb0Var;
                gb0Var.i = gb0Var2;
                jb0Var.g = gb0Var;
            }
        }
        sy syVar = (sy) obj;
        if (syVar == null || syVar.c(this)) {
            if (syVar != null) {
                return;
            }
            nxVar.a(ryVar);
        } else {
            s9.k("Cannot add the same observer with different lifecycles");
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_main, menu);
        View actionView = menu.findItem(R.id.action_search).getActionView();
        actionView.getClass();
        SearchView searchView = (SearchView) actionView;
        searchView.setQueryHint(getString(R.string.search_hint));
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setOnQueryTextListener(new kz(this));
        return true;
    }
}
