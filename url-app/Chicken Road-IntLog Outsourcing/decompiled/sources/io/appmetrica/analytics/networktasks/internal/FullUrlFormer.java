package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FullUrlFormer<T> {

    /* renamed from: a, reason: collision with root package name */
    private List f9868a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f9869b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f9870c;

    /* renamed from: d, reason: collision with root package name */
    private final IParamsAppender f9871d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigProvider f9872e;

    public FullUrlFormer(IParamsAppender<T> iParamsAppender, ConfigProvider<T> configProvider) {
        this.f9871d = iParamsAppender;
        this.f9872e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f9868a.get(this.f9869b)).buildUpon();
        this.f9871d.appendParams(buildUpon, this.f9872e.getConfig());
        this.f9870c = buildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f9868a;
    }

    public String getUrl() {
        return new c(this.f9870c).f9843a;
    }

    public boolean hasMoreHosts() {
        return this.f9869b + 1 < this.f9868a.size();
    }

    public void incrementAttemptNumber() {
        this.f9869b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f9868a = list;
    }
}
