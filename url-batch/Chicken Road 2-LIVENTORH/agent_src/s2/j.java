package s2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3208h;

    public /* synthetic */ j(Object obj, Object obj2, int i) {
        this.f3206f = i;
        this.f3207g = obj;
        this.f3208h = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3206f) {
            case 0:
                l lVar = (l) this.f3207g;
                lVar.f3214f.b((y2.f) this.f3208h);
                break;
            case 1:
                q qVar = (q) this.f3207g;
                qVar.f3231e.b((y2.j) this.f3208h);
                break;
            default:
                final w2.b bVar = (w2.b) this.f3207g;
                final x2.a aVar = (x2.a) this.f3208h;
                new AlertDialog.Builder(bVar.C()).setTitle("🔄 Reset Game").setMessage("Are you sure you want to reset all game progress? This action cannot be undone!").setPositiveButton("Reset", new DialogInterface.OnClickListener() { // from class: w2.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        x2.a aVar2 = x2.a.this;
                        aVar2.f3619a.edit().clear().apply();
                        b bVar2 = bVar;
                        Toast.makeText(bVar2.h(), "✅ Game reset successfully!", 0).show();
                        bVar2.G(aVar2);
                    }
                }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
                break;
        }
    }
}
