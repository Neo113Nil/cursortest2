package l0;

import android.net.Uri;
import android.os.Build;
import d0.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18521a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f18522b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f18523c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f18524d;

        static {
            int[] iArr = new int[d0.n.values().length];
            f18524d = iArr;
            try {
                iArr[d0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18524d[d0.n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[d0.k.values().length];
            f18523c = iArr2;
            try {
                iArr2[d0.k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18523c[d0.k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18523c[d0.k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18523c[d0.k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18523c[d0.k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[d0.a.values().length];
            f18522b = iArr3;
            try {
                iArr3[d0.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18522b[d0.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[d0.s.values().length];
            f18521a = iArr4;
            try {
                iArr4[d0.s.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18521a[d0.s.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18521a[d0.s.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18521a[d0.s.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18521a[d0.s.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18521a[d0.s.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(d0.a aVar) {
        int i7 = a.f18522b[aVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d0.c b(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable th;
        IOException e7;
        d0.c cVar = new d0.c();
        if (bArr == null) {
            return cVar;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            cVar.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e9) {
                        e7 = e9;
                        e7.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                        return cVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        } catch (IOException e14) {
            objectInputStream = null;
            e7 = e14;
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0067 -> B:18:0x006a). Please report as a decompilation issue!!! */
    public static byte[] c(d0.c cVar) {
        ObjectOutputStream objectOutputStream;
        boolean hasNext;
        ObjectOutputStream objectOutputStream2 = null;
        ObjectOutputStream objectOutputStream3 = null;
        objectOutputStream2 = null;
        if (cVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e7) {
                e = e7;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            objectOutputStream2 = objectOutputStream2;
        }
        try {
            objectOutputStream.writeInt(cVar.c());
            Iterator<c.a> it = cVar.b().iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != 0) {
                    c.a next = it.next();
                    objectOutputStream.writeUTF(next.a().toString());
                    objectOutputStream.writeBoolean(next.b());
                } else {
                    try {
                        break;
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            objectOutputStream2 = hasNext;
        } catch (IOException e10) {
            e = e10;
            objectOutputStream3 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream3 != null) {
                try {
                    objectOutputStream3.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            objectOutputStream2 = objectOutputStream3;
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e13) {
                e13.printStackTrace();
                throw th;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static d0.a d(int i7) {
        if (i7 == 0) {
            return d0.a.EXPONENTIAL;
        }
        if (i7 == 1) {
            return d0.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to BackoffPolicy");
    }

    public static d0.k e(int i7) {
        if (i7 == 0) {
            return d0.k.NOT_REQUIRED;
        }
        if (i7 == 1) {
            return d0.k.CONNECTED;
        }
        if (i7 == 2) {
            return d0.k.UNMETERED;
        }
        if (i7 == 3) {
            return d0.k.NOT_ROAMING;
        }
        if (i7 == 4) {
            return d0.k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i7 == 5) {
            return d0.k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to NetworkType");
    }

    public static d0.n f(int i7) {
        if (i7 == 0) {
            return d0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i7 == 1) {
            return d0.n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to OutOfQuotaPolicy");
    }

    public static d0.s g(int i7) {
        if (i7 == 0) {
            return d0.s.ENQUEUED;
        }
        if (i7 == 1) {
            return d0.s.RUNNING;
        }
        if (i7 == 2) {
            return d0.s.SUCCEEDED;
        }
        if (i7 == 3) {
            return d0.s.FAILED;
        }
        if (i7 == 4) {
            return d0.s.BLOCKED;
        }
        if (i7 == 5) {
            return d0.s.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to State");
    }

    public static int h(d0.k kVar) {
        int i7 = a.f18523c[kVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        if (i7 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && kVar == d0.k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + kVar + " to int");
    }

    public static int i(d0.n nVar) {
        int i7 = a.f18524d[nVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + nVar + " to int");
    }

    public static int j(d0.s sVar) {
        switch (a.f18521a[sVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + sVar + " to int");
        }
    }
}
