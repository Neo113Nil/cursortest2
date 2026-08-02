package defpackage;

import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ezx extends di {
    private int o;
    protected final eyu p = new eyu();

    private final void x() {
        this.o--;
    }

    private final void y() {
        int i = this.o;
        this.o = i + 1;
        if (i != 0) {
            return;
        }
        eyu eyuVar = this.p;
        exf.k();
        int i2 = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i2 >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i2);
                if (ezvVar instanceof eyr) {
                    exf.k();
                    ((eyr) ezvVar).a();
                    exf.k();
                }
                i2++;
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
    }

    @Override // defpackage.di, defpackage.cp, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    return super.dispatchKeyEvent(keyEvent);
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof exw) {
                    exf.k();
                    if (((exw) ezvVar).a()) {
                        exf.k();
                        return true;
                    }
                    exf.k();
                }
                i++;
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
    }

    @Override // defpackage.bg
    public final void e() {
        int i = 0;
        while (true) {
            List list = this.p.e;
            if (i >= list.size()) {
                return;
            }
            ezv ezvVar = (ezv) list.get(i);
            if (ezvVar instanceof fab) {
                ((fab) ezvVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    super.finish();
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof exx) {
                    exf.k();
                    try {
                        ((exx) ezvVar).a();
                        exf.k();
                    } finally {
                        exf.k();
                    }
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    super.finishAfterTransition();
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof exy) {
                    exf.k();
                    try {
                        ((exy) ezvVar).a();
                        exf.k();
                    } finally {
                        exf.k();
                    }
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.di, defpackage.dj
    public final void j(fg fgVar) {
        if (fgVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            List list = this.p.e;
            if (i >= list.size()) {
                return;
            }
            ezv ezvVar = (ezv) list.get(i);
            if (ezvVar instanceof fac) {
                ((fac) ezvVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.di, defpackage.dj
    public final void o() {
        int i = 0;
        while (true) {
            List list = this.p.e;
            if (i >= list.size()) {
                return;
            }
            ezv ezvVar = (ezv) list.get(i);
            if (ezvVar instanceof fad) {
                ((fad) ezvVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        exf.k();
        eyu eyuVar = this.p;
        int i2 = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i2 >= list.size()) {
                    exf.k();
                    super.onActivityReenter(i, intent);
                    return;
                }
                ezv ezvVar = (ezv) list.get(i2);
                if (ezvVar instanceof exz) {
                    exf.k();
                    try {
                        ((exz) ezvVar).a();
                        exf.k();
                    } finally {
                        exf.k();
                    }
                }
                i2++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bg, defpackage.ng, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.p.t();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        exf.k();
        eyu eyuVar = this.p;
        try {
            eyt eytVar = new eyt(0);
            eyuVar.p(eytVar);
            eyuVar.d = eytVar;
            exf.k();
            super.onAttachedToWindow();
        } catch (Throwable th) {
            exf.k();
            throw th;
        }
    }

    @Override // defpackage.ng, android.app.Activity
    public void onBackPressed() {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    super.onBackPressed();
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof eyb) {
                    exf.k();
                    if (((eyb) ezvVar).a()) {
                        exf.k();
                        return;
                    }
                    exf.k();
                }
                i++;
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
    }

    @Override // defpackage.di, defpackage.ng, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.p.u();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.p.v() || super.onContextItemSelected(menuItem);
    }

    @Override // defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.p.i(bundle);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.p.w();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return this.p.x() || super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.di, defpackage.bg, android.app.Activity
    protected void onDestroy() {
        this.p.a();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        exf.k();
        eyu eyuVar = this.p;
        try {
            ezd ezdVar = eyuVar.d;
            int i = 0;
            if (ezdVar != null) {
                eyuVar.o(ezdVar);
                eyuVar.d = null;
            }
            while (true) {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    super.onDetachedFromWindow();
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                ezvVar.getClass();
                if (ezvVar instanceof eyc) {
                    exf.k();
                    try {
                        ((eyc) ezvVar).a();
                        exf.k();
                    } finally {
                        exf.k();
                    }
                }
                i++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        ((defpackage.eyd) r0).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        defpackage.exf.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        defpackage.exf.k();
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    consumer.accept(Collections.EMPTY_LIST);
                    break;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof eyd) {
                    break;
                } else {
                    i++;
                }
            } finally {
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        exf.k();
        eyu eyuVar = this.p;
        int i2 = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i2 >= list.size()) {
                    exf.k();
                    return super.onKeyDown(i, keyEvent);
                }
                ezv ezvVar = (ezv) list.get(i2);
                if (ezvVar instanceof eye) {
                    exf.k();
                    if (((eye) ezvVar).a()) {
                        exf.k();
                        return true;
                    }
                    exf.k();
                }
                i2++;
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        exf.k();
        eyu eyuVar = this.p;
        int i2 = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i2 >= list.size()) {
                    exf.k();
                    return super.onKeyUp(i, keyEvent);
                }
                ezv ezvVar = (ezv) list.get(i2);
                if (ezvVar instanceof eyf) {
                    exf.k();
                    if (((eyf) ezvVar).a()) {
                        exf.k();
                        return true;
                    }
                    exf.k();
                }
                i2++;
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.p.j();
        super.onLowMemory();
    }

    @Override // defpackage.ng, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof eyg) {
                    exf.k();
                    ((eyg) ezvVar).a();
                    exf.k();
                }
                i++;
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.p.y() || super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.bg, android.app.Activity
    protected void onPause() {
        this.p.b();
        super.onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        ((defpackage.eyh) r2).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        defpackage.exf.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        defpackage.exf.k();
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    break;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof eyh) {
                    break;
                } else {
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
    }

    @Override // defpackage.di, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        exf.k();
        eyu eyuVar = this.p;
        try {
            eys eysVar = new eys(bundle, 1);
            eyuVar.p(eysVar);
            eyuVar.a = eysVar;
            exf.k();
            super.onPostCreate(bundle);
        } catch (Throwable th) {
            exf.k();
            throw th;
        }
    }

    @Override // defpackage.di, defpackage.bg, android.app.Activity
    protected void onPostResume() {
        exf.k();
        eyu eyuVar = this.p;
        try {
            eyt eytVar = new eyt(1);
            eyuVar.p(eytVar);
            eyuVar.c = eytVar;
            exf.k();
            super.onPostResume();
        } catch (Throwable th) {
            exf.k();
            throw th;
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.p.z() || super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    super.onProvideAssistContent(assistContent);
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof eyk) {
                    exf.k();
                    try {
                        ((eyk) ezvVar).a();
                        exf.k();
                    } finally {
                        exf.k();
                    }
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    super.onProvideAssistData(bundle);
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof eyl) {
                    exf.k();
                    try {
                        ((eyl) ezvVar).a();
                        exf.k();
                    } finally {
                        exf.k();
                    }
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bg, defpackage.ng, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.p.A();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        exf.k();
        eyu eyuVar = this.p;
        try {
            eys eysVar = new eys(bundle, 0);
            eyuVar.p(eysVar);
            eyuVar.b = eysVar;
            exf.k();
            super.onRestoreInstanceState(bundle);
        } catch (Throwable th) {
            exf.k();
            throw th;
        }
    }

    @Override // defpackage.bg, android.app.Activity
    protected void onResume() {
        exf.j(a());
        this.p.k();
        super.onResume();
    }

    @Override // defpackage.ng, defpackage.cp, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.p.l(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.di, defpackage.bg, android.app.Activity
    protected void onStart() {
        exf.j(a());
        this.p.m();
        super.onStart();
    }

    @Override // defpackage.di, defpackage.bg, android.app.Activity
    protected void onStop() {
        this.p.n();
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onTopResumedActivityChanged(boolean z) {
        exf.k();
        eyu eyuVar = this.p;
        try {
            if (!z) {
                ezd ezdVar = eyuVar.g;
                int i = 0;
                if (ezdVar != null) {
                    eyuVar.o(ezdVar);
                    eyuVar.g = null;
                }
                while (true) {
                    List list = eyuVar.e;
                    if (i >= list.size()) {
                        break;
                    }
                    eyuVar.s((ezv) list.get(i));
                    i++;
                }
            } else {
                eys eysVar = new eys(eyuVar, 5);
                eyuVar.p(eysVar);
                eyuVar.g = eysVar;
            }
            exf.k();
            super.onTopResumedActivityChanged(z);
        } catch (Throwable th) {
            exf.k();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    super.onUserInteraction();
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof eyo) {
                    exf.k();
                    try {
                        ((eyo) ezvVar).a();
                        exf.k();
                    } finally {
                        exf.k();
                    }
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ng, android.app.Activity
    protected final void onUserLeaveHint() {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    super.onUserLeaveHint();
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof eyp) {
                    exf.k();
                    try {
                        ((eyp) ezvVar).a();
                        exf.k();
                    } finally {
                        exf.k();
                    }
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        exf.k();
        eyu eyuVar = this.p;
        int i = 0;
        while (true) {
            try {
                List list = eyuVar.e;
                if (i >= list.size()) {
                    exf.k();
                    super.onWindowFocusChanged(z);
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof eyq) {
                    exf.k();
                    try {
                        ((eyq) ezvVar).a();
                        exf.k();
                    } finally {
                        exf.k();
                    }
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        y();
        super.startActivity(intent);
        x();
    }

    @Override // defpackage.ng, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        y();
        super.startActivityForResult(intent, i);
        x();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        y();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        x();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        y();
        super.startActivity(intent, bundle);
        x();
    }

    @Override // defpackage.ng, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        y();
        super.startActivityForResult(intent, i, bundle);
        x();
    }
}
