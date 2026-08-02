package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FullUrlFormer<T> {

    /* renamed from: a, reason: collision with root package name */
    private List f8894a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f8895b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f8896c;

    /* renamed from: d, reason: collision with root package name */
    private final IParamsAppender f8897d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigProvider f8898e;

    public FullUrlFormer(IParamsAppender<T> iParamsAppender, ConfigProvider<T> configProvider) {
        this.f8897d = iParamsAppender;
        this.f8898e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f8894a.get(this.f8895b)).buildUpon();
        this.f8897d.appendParams(buildUpon, this.f8898e.getConfig());
        this.f8896c = buildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f8894a;
    }

    public String getUrl() {
        return new c(this.f8896c).f8870a;
    }

    public boolean hasMoreHosts() {
        return this.f8895b + 1 < this.f8894a.size();
    }

    public void incrementAttemptNumber() {
        this.f8895b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f8894a = list;
    }
}
