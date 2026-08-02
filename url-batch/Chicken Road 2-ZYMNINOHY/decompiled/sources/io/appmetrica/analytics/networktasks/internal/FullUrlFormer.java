package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FullUrlFormer<T> {

    /* renamed from: a, reason: collision with root package name */
    private List f13311a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f13312b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f13313c;

    /* renamed from: d, reason: collision with root package name */
    private final IParamsAppender f13314d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigProvider f13315e;

    public FullUrlFormer(IParamsAppender<T> iParamsAppender, ConfigProvider<T> configProvider) {
        this.f13314d = iParamsAppender;
        this.f13315e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f13311a.get(this.f13312b)).buildUpon();
        this.f13314d.appendParams(buildUpon, this.f13315e.getConfig());
        this.f13313c = buildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f13311a;
    }

    public String getUrl() {
        return new c(this.f13313c).f13286a;
    }

    public boolean hasMoreHosts() {
        return this.f13312b + 1 < this.f13311a.size();
    }

    public void incrementAttemptNumber() {
        this.f13312b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f13311a = list;
    }
}
