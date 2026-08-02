package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ni {
    private static final int a = Color.argb(230, 255, 255, 255);
    private static final int b = Color.argb(128, 27, 27, 27);
    private static np c;

    public static /* synthetic */ void a(ng ngVar) {
        nx b2 = adk.b(0, 0);
        nx b3 = adk.b(a, b);
        View decorView = ngVar.getWindow().getDecorView();
        decorView.getClass();
        np npVar = c;
        if (npVar == null) {
            npVar = Build.VERSION.SDK_INT >= 35 ? new nn() : Build.VERSION.SDK_INT >= 30 ? new nm() : Build.VERSION.SDK_INT >= 29 ? new nl() : new nk();
            c = npVar;
        }
        np npVar2 = npVar;
        Window window = ngVar.getWindow();
        window.getClass();
        krt krtVar = b2.a;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) krtVar.a(resources)).booleanValue();
        krt krtVar2 = b3.a;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        npVar2.a(b2, b3, window, decorView, booleanValue, ((Boolean) krtVar2.a(resources2)).booleanValue());
        Window window2 = ngVar.getWindow();
        window2.getClass();
        npVar2.b(window2);
    }
}
