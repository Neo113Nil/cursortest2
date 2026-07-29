package com.tapjoy.internal;

import android.graphics.Bitmap;
import com.tapjoy.internal.ap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes2.dex */
public final class hy {
    public static final bi e;
    private static final an f;

    /* renamed from: a, reason: collision with root package name */
    public URL f8341a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f8342b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8343c;

    /* renamed from: d, reason: collision with root package name */
    public Cif f8344d;

    static {
        an arVar = new ar();
        if (!(arVar instanceof as)) {
            arVar = new ap.a((aq) arVar);
        }
        f = arVar;
        e = new bi() { // from class: com.tapjoy.internal.hy.1
            @Override // com.tapjoy.internal.bi
            public final /* synthetic */ Object a(bn bnVar) {
                return new hy(bnVar);
            }
        };
    }

    public hy(URL url) {
        this.f8341a = url;
    }

    public final boolean a() {
        return (this.f8342b == null && this.f8343c == null) ? false : true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.tapjoy.internal.hu.2.<init>(com.tapjoy.internal.hu, java.net.URL, java.io.InputStream, long):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        r12 = java.lang.Long.parseLong(r8.substring(8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.hy.b():void");
    }

    private ByteArrayInputStream a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        jy.a(inputStream, byteArrayOutputStream);
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ig igVar = new ig();
        igVar.a(byteArray);
        Cif a2 = igVar.a();
        if (a2.f8369b == 0) {
            this.f8343c = byteArray;
            this.f8344d = a2;
        } else {
            s sVar = s.f8513a;
            this.f8342b = s.a(byteArrayInputStream);
            byteArrayInputStream.reset();
        }
        return byteArrayInputStream;
    }

    hy(bn bnVar) {
        if (bnVar.k() == bs.STRING) {
            this.f8341a = bnVar.e();
            return;
        }
        bnVar.h();
        String l = bnVar.l();
        while (bnVar.j()) {
            if ("url".equals(l)) {
                this.f8341a = bnVar.e();
            } else {
                bnVar.s();
            }
        }
        bnVar.i();
    }
}
