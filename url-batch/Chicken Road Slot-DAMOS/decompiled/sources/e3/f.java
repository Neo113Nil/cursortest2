package e3;

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3800e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3801f;

    public f(int i3) {
        this.f3800e = i3;
        switch (i3) {
            case 1:
                this.f3801f = new ArrayList();
                break;
        }
    }

    @Override // e3.i
    public final void a(o oVar) {
        switch (this.f3800e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) oVar.f3829c).setBigContentTitle(this.f3824b).bigText((CharSequence) this.f3801f);
                if (this.f3826d) {
                    bigText.setSummaryText(this.f3825c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) oVar.f3829c).setBigContentTitle(this.f3824b);
                if (this.f3826d) {
                    bigContentTitle.setSummaryText(this.f3825c);
                }
                ArrayList arrayList = (ArrayList) this.f3801f;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // e3.i
    public final String b() {
        switch (this.f3800e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
