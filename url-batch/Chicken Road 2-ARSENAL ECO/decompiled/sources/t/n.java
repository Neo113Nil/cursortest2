package t;

import android.app.Notification;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5915e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5916f;

    public n(int i7) {
        this.f5915e = i7;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f5916f = new ArrayList();
                break;
        }
    }

    @Override // t.r
    public final void a(V5.u uVar) {
        switch (this.f5915e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) uVar.f2770d).setBigContentTitle(this.f5941b).bigText((CharSequence) this.f5916f);
                if (this.f5943d) {
                    bigText.setSummaryText(this.f5942c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) uVar.f2770d).setBigContentTitle(this.f5941b);
                if (this.f5943d) {
                    bigContentTitle.setSummaryText(this.f5942c);
                }
                ArrayList arrayList = (ArrayList) this.f5916f;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // t.r
    public final String b() {
        switch (this.f5915e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
