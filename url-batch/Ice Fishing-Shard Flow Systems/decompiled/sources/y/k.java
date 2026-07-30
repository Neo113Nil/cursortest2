package y;

import android.app.Notification;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8473e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8474f;

    public k(int i2) {
        this.f8473e = i2;
        switch (i2) {
            case 1:
                this.f8474f = new ArrayList();
                break;
        }
    }

    @Override // y.n
    public final void a(B6.v vVar) {
        switch (this.f8473e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) vVar.f261d).setBigContentTitle(this.f8498b).bigText((CharSequence) this.f8474f);
                if (this.f8500d) {
                    bigText.setSummaryText(this.f8499c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) vVar.f261d).setBigContentTitle(this.f8498b);
                if (this.f8500d) {
                    bigContentTitle.setSummaryText(this.f8499c);
                }
                ArrayList arrayList = (ArrayList) this.f8474f;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // y.n
    public final String b() {
        switch (this.f8473e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
