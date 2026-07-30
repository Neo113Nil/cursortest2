package com.anythink.core.common.n.b;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public abstract class ae {
    private static ae a(x xVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (xVar != null) {
            Charset a9 = xVar.a((Charset) null);
            if (a9 == null) {
                xVar = x.b(xVar + "; charset=utf-8");
            } else {
                charset = a9;
            }
        }
        byte[] bytes = str.getBytes(charset);
        return a(xVar, bytes, bytes.length);
    }

    private static boolean c() {
        return false;
    }

    private static boolean d() {
        return false;
    }

    public abstract x a();

    public abstract void a(com.anythink.core.common.n.c.d dVar);

    public long b() {
        return -1L;
    }

    private static ae a(final x xVar, final com.anythink.core.common.n.c.f fVar) {
        return new ae() { // from class: com.anythink.core.common.n.b.ae.1
            @Override // com.anythink.core.common.n.b.ae
            public final x a() {
                return x.this;
            }

            @Override // com.anythink.core.common.n.b.ae
            public final long b() {
                return fVar.j();
            }

            @Override // com.anythink.core.common.n.b.ae
            public final void a(com.anythink.core.common.n.c.d dVar) {
                dVar.d(fVar);
            }
        };
    }

    public static ae a(x xVar, byte[] bArr) {
        return a(xVar, bArr, bArr.length);
    }

    private static ae a(final x xVar, final byte[] bArr, final int i) {
        if (bArr != null) {
            com.anythink.core.common.n.b.a.c.a(bArr.length, i);
            return new ae() { // from class: com.anythink.core.common.n.b.ae.2

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f15654d = 0;

                @Override // com.anythink.core.common.n.b.ae
                public final x a() {
                    return x.this;
                }

                @Override // com.anythink.core.common.n.b.ae
                public final long b() {
                    return i;
                }

                @Override // com.anythink.core.common.n.b.ae
                public final void a(com.anythink.core.common.n.c.d dVar) {
                    dVar.c(bArr, this.f15654d, i);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    private static ae a(final x xVar, final File file) {
        if (file != null) {
            return new ae() { // from class: com.anythink.core.common.n.b.ae.3
                @Override // com.anythink.core.common.n.b.ae
                public final x a() {
                    return x.this;
                }

                @Override // com.anythink.core.common.n.b.ae
                public final long b() {
                    return file.length();
                }

                @Override // com.anythink.core.common.n.b.ae
                public final void a(com.anythink.core.common.n.c.d dVar) {
                    com.anythink.core.common.n.c.w a9 = com.anythink.core.common.n.c.n.a(file);
                    try {
                        dVar.a(a9);
                        if (a9 != null) {
                            a9.close();
                        }
                    } catch (Throwable th) {
                        if (a9 != null) {
                            try {
                                a9.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}
