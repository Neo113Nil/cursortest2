package pa;

import android.content.DialogInterface;
import com.onesignal.notifications.internal.registration.impl.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7700b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f7699a = i3;
        this.f7700b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        switch (this.f7699a) {
            case 0:
                d.show$lambda$0((c) this.f7700b, dialogInterface, i3);
                break;
            case 1:
                d.show$lambda$1((c) this.f7700b, dialogInterface, i3);
                break;
            default:
                a.b.invokeSuspend$lambda$1((com.onesignal.notifications.internal.registration.impl.a) this.f7700b, dialogInterface, i3);
                break;
        }
    }
}
