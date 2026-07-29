package com.facebook.ads.internal.view;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.ads.internal.r.a;
import com.facebook.ads.internal.view.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends RecyclerView.Adapter<b> {

    /* renamed from: a, reason: collision with root package name */
    private final com.facebook.ads.internal.m.c f5869a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.ads.internal.q.a.s f5870b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.ads.internal.adapters.j f5871c;

    /* renamed from: d, reason: collision with root package name */
    private a.InterfaceC0352a f5872d;
    private int e;
    private int f;
    private String g;
    private boolean h;
    private int i;
    private List<a> j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f5873a;

        /* renamed from: b, reason: collision with root package name */
        public String f5874b;

        /* renamed from: c, reason: collision with root package name */
        public String f5875c;

        /* renamed from: d, reason: collision with root package name */
        public String f5876d;
        public String e;
        private final int f;
        private final int g;
        private com.facebook.ads.internal.r.a h;
        private boolean i = false;
        private a.AbstractC0350a j;

        public a(int i, int i2, String str, String str2, String str3, String str4, String str5) {
            this.f = i;
            this.g = i2;
            this.e = str;
            this.f5873a = str2;
            this.f5874b = str3;
            this.f5875c = str4;
            this.f5876d = str5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(final com.facebook.ads.internal.m.c cVar, final com.facebook.ads.internal.q.a.s sVar, final String str, h hVar) {
            if (this.i) {
                return;
            }
            if (this.h != null) {
                this.h.b();
                this.h = null;
            }
            this.j = new a.AbstractC0350a() { // from class: com.facebook.ads.internal.view.i.a.1
                @Override // com.facebook.ads.internal.r.a.AbstractC0350a
                public void a() {
                    if (!TextUtils.isEmpty(str)) {
                        Map<String, String> a2 = a.this.a();
                        if (a.this.h != null) {
                            a.this.h.a(a2);
                        }
                        a2.put("touch", com.facebook.ads.internal.q.a.j.a(sVar.e()));
                        cVar.a(str, a2);
                    }
                    a.this.i = true;
                }
            };
            this.h = new com.facebook.ads.internal.r.a(hVar, 10, this.j);
            this.h.a(100);
            this.h.b(100);
            this.h.a();
        }

        public Map<String, String> a() {
            HashMap hashMap = new HashMap();
            hashMap.put("cardind", this.f + "");
            hashMap.put("cardcnt", this.g + "");
            return hashMap;
        }
    }

    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public h f5881a;

        public b(h hVar) {
            super(hVar);
            this.f5881a = hVar;
        }
    }

    public i(List<a> list, com.facebook.ads.internal.m.c cVar, com.facebook.ads.internal.q.a.s sVar, a.InterfaceC0352a interfaceC0352a, com.facebook.ads.internal.adapters.j jVar, String str, int i, int i2, int i3, boolean z) {
        this.f5869a = cVar;
        this.f5870b = sVar;
        this.f5872d = interfaceC0352a;
        this.j = list;
        this.f = i;
        this.f5871c = jVar;
        this.h = z;
        this.g = str;
        this.e = i3;
        this.i = i2;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(new h(viewGroup.getContext(), this.f5871c, this.h, this.f5869a, this.f5872d, this.g));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f, -2);
        marginLayoutParams.setMargins(i == 0 ? this.e : this.i, 0, i >= this.j.size() + (-1) ? this.e : this.i, 0);
        a aVar = this.j.get(i);
        bVar.f5881a.setImageUrl(aVar.e);
        bVar.f5881a.setLayoutParams(marginLayoutParams);
        bVar.f5881a.a(aVar.f5873a, aVar.f5874b);
        bVar.f5881a.a(aVar.f5875c, aVar.f5876d, aVar.a());
        aVar.a(this.f5869a, this.f5870b, this.g, bVar.f5881a);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.j.size();
    }
}
