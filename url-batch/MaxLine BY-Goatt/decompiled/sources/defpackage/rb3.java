package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rb3 extends bb3 {
    public final /* synthetic */ ic2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb3(ic2 ic2Var, Looper looper) {
        super(looper);
        this.a = ic2Var;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ic2 ic2Var = this.a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new be3());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof ue3) {
                        ic2Var.g = (ue3) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        ic2Var.f = (Messenger) parcelableExtra;
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
                    Matcher matcher = ic2.j.matcher(stringExtra);
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
                        ic2Var.b(extras, group);
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
                if (stringExtra2.startsWith("|")) {
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
                    ic2Var.b(intent2.putExtra("error", str2).getExtras(), str);
                    return;
                }
                synchronized (ic2Var.a) {
                    int i = 0;
                    while (true) {
                        try {
                            fl2 fl2Var = ic2Var.a;
                            if (i < fl2Var.o) {
                                ic2Var.b(intent2.getExtras(), (String) fl2Var.e(i));
                                i++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
