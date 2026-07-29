package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.ab;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: TDeserializer.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final ah f9070a;

    /* renamed from: b, reason: collision with root package name */
    private final au f9071b;

    public l() {
        this(new ab.a());
    }

    public l(aj ajVar) {
        this.f9071b = new au();
        this.f9070a = ajVar.a(this.f9071b);
    }

    public void a(i iVar, byte[] bArr) throws o {
        try {
            this.f9071b.a(bArr);
            iVar.read(this.f9070a);
        } finally {
            this.f9071b.e();
            this.f9070a.B();
        }
    }

    public void a(i iVar, String str, String str2) throws o {
        try {
            try {
                a(iVar, str.getBytes(str2));
            } catch (UnsupportedEncodingException unused) {
                throw new o("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.f9070a.B();
        }
    }

    public void a(i iVar, byte[] bArr, p pVar, p... pVarArr) throws o {
        try {
            try {
                if (j(bArr, pVar, pVarArr) != null) {
                    iVar.read(this.f9070a);
                }
            } catch (Exception e) {
                throw new o(e);
            }
        } finally {
            this.f9071b.e();
            this.f9070a.B();
        }
    }

    public Boolean a(byte[] bArr, p pVar, p... pVarArr) throws o {
        return (Boolean) a((byte) 2, bArr, pVar, pVarArr);
    }

    public Byte b(byte[] bArr, p pVar, p... pVarArr) throws o {
        return (Byte) a((byte) 3, bArr, pVar, pVarArr);
    }

    public Double c(byte[] bArr, p pVar, p... pVarArr) throws o {
        return (Double) a((byte) 4, bArr, pVar, pVarArr);
    }

    public Short d(byte[] bArr, p pVar, p... pVarArr) throws o {
        return (Short) a((byte) 6, bArr, pVar, pVarArr);
    }

    public Integer e(byte[] bArr, p pVar, p... pVarArr) throws o {
        return (Integer) a((byte) 8, bArr, pVar, pVarArr);
    }

    public Long f(byte[] bArr, p pVar, p... pVarArr) throws o {
        return (Long) a((byte) 10, bArr, pVar, pVarArr);
    }

    public String g(byte[] bArr, p pVar, p... pVarArr) throws o {
        return (String) a((byte) 11, bArr, pVar, pVarArr);
    }

    public ByteBuffer h(byte[] bArr, p pVar, p... pVarArr) throws o {
        return (ByteBuffer) a((byte) 100, bArr, pVar, pVarArr);
    }

    public Short i(byte[] bArr, p pVar, p... pVarArr) throws o {
        Short sh;
        try {
            try {
                if (j(bArr, pVar, pVarArr) != null) {
                    this.f9070a.j();
                    sh = Short.valueOf(this.f9070a.l().f9013c);
                } else {
                    sh = null;
                }
                return sh;
            } catch (Exception e) {
                throw new o(e);
            }
        } finally {
            this.f9071b.e();
            this.f9070a.B();
        }
    }

    private Object a(byte b2, byte[] bArr, p pVar, p... pVarArr) throws o {
        Object obj;
        try {
            try {
                ac j = j(bArr, pVar, pVarArr);
                if (j != null) {
                    if (b2 != 6) {
                        if (b2 != 8) {
                            if (b2 != 100) {
                                switch (b2) {
                                    case 2:
                                        if (j.f9012b == 2) {
                                            obj = Boolean.valueOf(this.f9070a.t());
                                            break;
                                        }
                                        break;
                                    case 3:
                                        if (j.f9012b == 3) {
                                            obj = Byte.valueOf(this.f9070a.u());
                                            break;
                                        }
                                        break;
                                    case 4:
                                        if (j.f9012b == 4) {
                                            obj = Double.valueOf(this.f9070a.y());
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (b2) {
                                            case 10:
                                                if (j.f9012b == 10) {
                                                    obj = Long.valueOf(this.f9070a.x());
                                                    break;
                                                }
                                                break;
                                            case 11:
                                                if (j.f9012b == 11) {
                                                    obj = this.f9070a.z();
                                                    break;
                                                }
                                                break;
                                        }
                                }
                            } else if (j.f9012b == 11) {
                                obj = this.f9070a.A();
                            }
                        } else if (j.f9012b == 8) {
                            obj = Integer.valueOf(this.f9070a.w());
                        }
                    } else if (j.f9012b == 6) {
                        obj = Short.valueOf(this.f9070a.v());
                    }
                    return obj;
                }
                obj = null;
                return obj;
            } catch (Exception e) {
                throw new o(e);
            }
        } finally {
            this.f9071b.e();
            this.f9070a.B();
        }
    }

    private ac j(byte[] bArr, p pVar, p... pVarArr) throws o {
        this.f9071b.a(bArr);
        p[] pVarArr2 = new p[pVarArr.length + 1];
        int i = 0;
        pVarArr2[0] = pVar;
        int i2 = 0;
        while (i2 < pVarArr.length) {
            int i3 = i2 + 1;
            pVarArr2[i3] = pVarArr[i2];
            i2 = i3;
        }
        this.f9070a.j();
        ac acVar = null;
        while (i < pVarArr2.length) {
            acVar = this.f9070a.l();
            if (acVar.f9012b == 0 || acVar.f9013c > pVarArr2[i].a()) {
                return null;
            }
            if (acVar.f9013c != pVarArr2[i].a()) {
                ak.a(this.f9070a, acVar.f9012b);
                this.f9070a.m();
            } else {
                i++;
                if (i < pVarArr2.length) {
                    this.f9070a.j();
                }
            }
        }
        return acVar;
    }

    public void a(i iVar, String str) throws o {
        a(iVar, str.getBytes());
    }
}
