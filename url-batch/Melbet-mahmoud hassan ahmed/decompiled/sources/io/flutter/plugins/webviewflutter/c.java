package io.flutter.plugins.webviewflutter;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

@TargetApi(19)
/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<DisplayManager.DisplayListener> f17627a;

    class a implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f17628a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DisplayManager f17629b;

        a(ArrayList arrayList, DisplayManager displayManager) {
            this.f17628a = arrayList;
            this.f17629b = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i7) {
            Iterator it = this.f17628a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i7);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i7) {
            if (this.f17629b.getDisplay(i7) == null) {
                return;
            }
            Iterator it = this.f17628a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i7);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i7) {
            Iterator it = this.f17628a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i7);
            }
        }
    }

    c() {
    }

    private static ArrayList<DisplayManager.DisplayListener> c(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList<>();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            Field field = null;
            ArrayList<DisplayManager.DisplayListener> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(next));
            }
            return arrayList2;
        } catch (IllegalAccessException | NoSuchFieldException e7) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e7);
            return new ArrayList<>();
        }
    }

    void a(DisplayManager displayManager) {
        ArrayList<DisplayManager.DisplayListener> c7 = c(displayManager);
        c7.removeAll(this.f17627a);
        if (c7.isEmpty()) {
            return;
        }
        Iterator<DisplayManager.DisplayListener> it = c7.iterator();
        while (it.hasNext()) {
            displayManager.unregisterDisplayListener(it.next());
            displayManager.registerDisplayListener(new a(c7, displayManager), null);
        }
    }

    void b(DisplayManager displayManager) {
        this.f17627a = c(displayManager);
    }
}
