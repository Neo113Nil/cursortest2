package com.baidu.mapsdkplatform.comapi.map.z;

import com.baidu.platform.comapi.map.InnerOverlay;
import com.baidu.platform.comapi.map.g;
import com.baidu.platform.comapi.util.JsonBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends InnerOverlay {

    /* renamed from: d, reason: collision with root package name */
    private boolean f8191d;

    /* renamed from: e, reason: collision with root package name */
    private int f8192e;

    /* renamed from: f, reason: collision with root package name */
    private int f8193f;

    /* renamed from: g, reason: collision with root package name */
    private int f8194g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8195h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8196i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8197j;

    /* renamed from: k, reason: collision with root package name */
    public final List<g> f8198k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8199l;

    public a() {
        super(36);
        this.f8191d = false;
        this.f8192e = 0;
        this.f8193f = 0;
        this.f8194g = 0;
        this.f8195h = true;
        this.f8196i = false;
        this.f8197j = false;
        this.f8198k = new ArrayList();
        this.f8199l = true;
    }

    public void a(boolean z7) {
        this.f8196i = z7;
    }

    public void b(boolean z7) {
        this.f8195h = z7;
    }

    public void c(boolean z7) {
        this.f8197j = z7;
    }

    @Override // com.baidu.platform.comapi.map.InnerOverlay
    public void clear() {
        this.f8196i = false;
        this.f8197j = false;
        synchronized (this.f8198k) {
            this.f8198k.clear();
        }
        super.clear();
    }

    @Override // com.baidu.platform.comapi.map.InnerOverlay
    public String getData() {
        if (this.f8199l) {
            synchronized (this.f8198k) {
                try {
                    if (this.f8198k.size() == 0) {
                        return "";
                    }
                    JsonBuilder jsonBuilder = new JsonBuilder();
                    jsonBuilder.object();
                    if (this.f8197j) {
                        jsonBuilder.key("statuschange").value(1);
                        jsonBuilder.key("onpause").value(this.f8196i ? 1 : 0);
                        jsonBuilder.endObject();
                        setData(jsonBuilder.getJson());
                        this.f8199l = false;
                        return super.getData();
                    }
                    jsonBuilder.key("dataset").arrayValue();
                    Iterator<g> it = this.f8198k.iterator();
                    while (it.hasNext()) {
                        jsonBuilder.objectValue(it.next().a());
                    }
                    jsonBuilder.endArrayValue();
                    jsonBuilder.key("startValue").value(0);
                    jsonBuilder.key("endValue").value(1);
                    if (this.f8191d) {
                        jsonBuilder.key("isNeedRouteAnimate").value(1);
                        jsonBuilder.key("durationTime").value(this.f8192e);
                        jsonBuilder.key("delayTime").value(this.f8193f);
                        jsonBuilder.key("easingCurve").value(this.f8194g);
                        this.f8191d = false;
                    } else {
                        jsonBuilder.key("isNeedRouteAnimate").value(0);
                        jsonBuilder.key("durationTime").value(0);
                        jsonBuilder.key("delayTime").value(0);
                        jsonBuilder.key("easingCurve").value(0);
                    }
                    if (this.f8195h) {
                        jsonBuilder.key("isRotateWhenTrack").value(1);
                    } else {
                        jsonBuilder.key("isRotateWhenTrack").value(0);
                    }
                    jsonBuilder.endObject();
                    setData(jsonBuilder.getJson());
                    this.f8199l = false;
                } finally {
                }
            }
        }
        return super.getData();
    }

    @Override // com.baidu.platform.comapi.map.InnerOverlay
    public void setData(String str) {
        super.setData(str);
        this.f8199l = true;
    }

    public void a(boolean z7, int i8, int i9, int i10) {
        this.f8191d = z7;
        this.f8192e = i8;
        this.f8193f = i9;
        this.f8194g = i10;
    }

    public boolean b() {
        return this.f8196i;
    }

    public boolean c() {
        return this.f8197j;
    }

    public boolean a(g gVar) {
        synchronized (this.f8198k) {
            try {
                if (this.f8198k.contains(gVar)) {
                    return false;
                }
                boolean add = this.f8198k.add(gVar);
                this.f8199l = add;
                return add;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        this.f8199l = true;
        UpdateOverlay();
    }
}
