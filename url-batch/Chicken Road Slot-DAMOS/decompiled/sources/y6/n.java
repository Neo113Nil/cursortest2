package y6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.measurement.z5;
import java.util.Objects;
import java.util.regex.Matcher;
import s.r0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends z5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f10664a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c cVar, Looper looper) {
        super(looper);
        this.f10664a = cVar;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c cVar = this.f10664a;
        cVar.getClass();
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new e());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof f) {
                        cVar.g = (f) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f10639f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = c.j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        cVar.a(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    r0 r0Var = cVar.f10634a;
                    synchronized (r0Var) {
                        for (int i3 = 0; i3 < r0Var.f8369i; i3++) {
                            try {
                                cVar.a((String) r0Var.e(i3), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                cVar.a(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
