package k1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import r.C1401k;

/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1209e extends A1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1206b f10686a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1209e(C1206b c1206b, Looper looper) {
        super(looper);
        this.f10686a = c1206b;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1206b c1206b = this.f10686a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C1210f());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C1211g) {
                        c1206b.f10680g = (C1211g) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1206b.f10679f = (Messenger) parcelableExtra;
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
                    Matcher matcher = C1206b.f10673j.matcher(stringExtra);
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
                        c1206b.b(extras, group);
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
                    synchronized (c1206b.f10674a) {
                        int i2 = 0;
                        while (true) {
                            try {
                                C1401k c1401k = c1206b.f10674a;
                                if (i2 < c1401k.f11713c) {
                                    c1206b.b(intent2.getExtras(), (String) c1401k.h(i2));
                                    i2++;
                                }
                            } finally {
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
                if (str2.startsWith(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                    str2 = str2.substring(1);
                }
                c1206b.b(intent2.putExtra("error", str2).getExtras(), str);
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
