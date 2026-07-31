package com.my.tracker.personalize;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.AbstractC1658m;
import com.my.tracker.obfuscated.AbstractC1686t0;
import com.my.tracker.obfuscated.AbstractC1708y2;
import com.my.tracker.obfuscated.C1712z2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PersonalizeApiClient {

    /* renamed from: a, reason: collision with root package name */
    private final a f21627a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private List f21628a;

        /* renamed from: b, reason: collision with root package name */
        private Context f21629b;

        public PersonalizeApiClient build() {
            C1712z2 c1712z2 = MyTracker.a.f20846a;
            String g4 = c1712z2.g();
            if (TextUtils.isEmpty(g4)) {
                AbstractC1708y2.a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");
                return null;
            }
            Context context = this.f21629b;
            String instanceId = context != null ? MyTracker.getInstanceId(context) : null;
            List list = this.f21628a;
            return new PersonalizeApiClient(new a(g4, (list == null || instanceId == null || !list.contains(instanceId)) ? c1712z2.l() : c1712z2.k()));
        }

        @NonNull
        public Builder withTestDevices(Context context, List<String> list) {
            this.f21628a = list;
            this.f21629b = context;
            return this;
        }
    }

    public interface OnCompleteListener<T> {
        void onRequestComplete(@NonNull PersonalizeApiClient personalizeApiClient, @NonNull PersonalizeRequest<T> personalizeRequest, @NonNull PersonalizeResponse<T> personalizeResponse);
    }

    PersonalizeApiClient(a aVar) {
        this.f21627a = aVar;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public <T> void sendRequest(@NonNull final PersonalizeRequest<T> personalizeRequest, final Handler handler, @NonNull final OnCompleteListener<T> onCompleteListener) {
        final String a4 = a(personalizeRequest, this.f21627a);
        AbstractC1658m.b(new Runnable() { // from class: com.my.tracker.personalize.e
            @Override // java.lang.Runnable
            public final void run() {
                PersonalizeApiClient.this.a(a4, personalizeRequest, handler, onCompleteListener);
            }
        });
    }

    private String a(PersonalizeRequest personalizeRequest, a aVar) {
        String str = aVar.f21636b + "/api/v1/recommendation" + personalizeRequest.a();
        Map b4 = personalizeRequest.b();
        b4.remove("sdk_key");
        if (b4.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : b4.entrySet()) {
            String str2 = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                buildUpon.appendQueryParameter(str2, (String) it.next());
            }
        }
        buildUpon.appendQueryParameter("sdk_key", aVar.f21635a);
        return buildUpon.toString();
    }

    private void a(PersonalizeRequest personalizeRequest, AbstractC1686t0.b bVar, Handler handler, OnCompleteListener onCompleteListener) {
        if (bVar == null) {
            AbstractC1708y2.a("PersonalizeApiClient: MyTracker hasn't been initialized yet");
            a(personalizeRequest, null, null, handler, "MyTracker hasn't been initialized yet", onCompleteListener);
            return;
        }
        String str = (String) bVar.b();
        if (TextUtils.isEmpty(str)) {
            AbstractC1708y2.a("PersonalizeApiClient: HTTP response is empty");
            a(personalizeRequest, null, null, handler, "HTTP response is empty", onCompleteListener);
            return;
        }
        try {
            c a4 = personalizeRequest.c().a(new JSONObject(str));
            String a5 = a4.a();
            if (a5 != null) {
                a(personalizeRequest, null, null, handler, a5, onCompleteListener);
            } else {
                a(personalizeRequest, a4.b(), str, handler, null, onCompleteListener);
            }
        } catch (Throwable th) {
            String str2 = "Can't parse JSON with error: " + th.getMessage();
            AbstractC1708y2.a("PersonalizeApiClient: " + str2);
            a(personalizeRequest, null, null, handler, str2, onCompleteListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse(null, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {
        a(personalizeRequest, AbstractC1686t0.a((MyTrackerConfig.OkHttpClientProvider) null).a(str), handler, onCompleteListener);
    }

    private void a(final PersonalizeRequest personalizeRequest, Object obj, String str, Handler handler, final String str2, final OnCompleteListener onCompleteListener) {
        Runnable runnable;
        if (handler == null) {
            handler = AbstractC1658m.f21416a;
        }
        if (TextUtils.isEmpty(str2)) {
            final PersonalizeResponse personalizeResponse = new PersonalizeResponse(obj, null, str);
            runnable = new Runnable() { // from class: com.my.tracker.personalize.g
                @Override // java.lang.Runnable
                public final void run() {
                    PersonalizeApiClient.this.a(onCompleteListener, personalizeRequest, personalizeResponse);
                }
            };
        } else {
            AbstractC1708y2.b("PersonalizeApiClient: " + str2);
            runnable = new Runnable() { // from class: com.my.tracker.personalize.f
                @Override // java.lang.Runnable
                public final void run() {
                    PersonalizeApiClient.this.a(onCompleteListener, personalizeRequest, str2);
                }
            };
        }
        handler.post(runnable);
    }
}
