package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FullUrlFormer<T> {

    /* renamed from: a, reason: collision with root package name */
    private List f40600a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f40601b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f40602c;

    /* renamed from: d, reason: collision with root package name */
    private final IParamsAppender f40603d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigProvider f40604e;

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.f40603d = iParamsAppender;
        this.f40604e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f40600a.get(this.f40601b)).buildUpon();
        this.f40603d.appendParams(buildUpon, this.f40604e.getConfig());
        this.f40602c = buildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f40600a;
    }

    public String getUrl() {
        return new c(this.f40602c).f40575a;
    }

    public boolean hasMoreHosts() {
        return this.f40601b + 1 < this.f40600a.size();
    }

    public void incrementAttemptNumber() {
        this.f40601b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f40600a = list;
    }
}
