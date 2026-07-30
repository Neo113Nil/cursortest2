package D;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t extends x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547e;

    /* renamed from: f, reason: collision with root package name */
    public Object f548f;

    public t(int i) {
        this.f547e = i;
        switch (i) {
            case 1:
                this.f548f = new ArrayList();
                break;
        }
    }

    @Override // D.x
    public final void a(H h9) {
        switch (this.f547e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) h9.f493w).setBigContentTitle(this.f572b).bigText((CharSequence) this.f548f);
                if (this.f574d) {
                    bigText.setSummaryText(this.f573c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) h9.f493w).setBigContentTitle(this.f572b);
                if (this.f574d) {
                    bigContentTitle.setSummaryText(this.f573c);
                }
                Iterator it = ((ArrayList) this.f548f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // D.x
    public final String b() {
        switch (this.f547e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
