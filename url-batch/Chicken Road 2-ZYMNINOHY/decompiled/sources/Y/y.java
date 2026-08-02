package Y;

import W.J;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class y extends AbstractC0123c {

    /* renamed from: e, reason: collision with root package name */
    public final Context f3746e;

    /* renamed from: f, reason: collision with root package name */
    public k f3747f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f3748g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f3749h;

    /* renamed from: i, reason: collision with root package name */
    public long f3750i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3751j;

    public y(Context context) {
        super(false);
        this.f3746e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i4) {
        return Uri.parse("rawresource:///" + i4);
    }

    @Override // Y.h
    public final Uri B() {
        k kVar = this.f3747f;
        if (kVar != null) {
            return kVar.f3701a;
        }
        return null;
    }

    @Override // Y.h
    public final long b(k kVar) {
        Resources resourcesForApplication;
        int parseInt;
        int i4;
        Resources resources;
        this.f3747f = kVar;
        g();
        Uri uri = kVar.f3701a;
        long j4 = kVar.f3706f;
        long j5 = kVar.f3705e;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f3746e;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new x(2000, "rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null);
            }
            try {
                i4 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new x(1004, "Resource identifier must be an integer.", null);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new x(1004, "Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new x(2005, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e4);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new x(1004, "Resource identifier must be an integer.", null);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(AbstractC1514c.b(packageName, StringUtils.PROCESS_POSTFIX_DELIMITER, path), "raw", null);
                if (parseInt == 0) {
                    throw new x(2005, "Resource not found.", null);
                }
            }
            i4 = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i4);
            if (openRawResourceFd == null) {
                throw new x(2000, "Resource is compressed: " + normalizeScheme, null);
            }
            this.f3748g = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f3748g.getFileDescriptor());
            this.f3749h = fileInputStream;
            try {
                if (length != -1 && j5 > length) {
                    throw new x(2008, null, null);
                }
                long startOffset = this.f3748g.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j5) - startOffset;
                if (skip != j5) {
                    throw new x(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f3750i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f3750i = size;
                        if (size < 0) {
                            throw new x(2008, null, null);
                        }
                    }
                } else {
                    long j6 = length - skip;
                    this.f3750i = j6;
                    if (j6 < 0) {
                        throw new i(2008);
                    }
                }
                if (j4 != -1) {
                    long j7 = this.f3750i;
                    this.f3750i = j7 == -1 ? j4 : Math.min(j7, j4);
                }
                this.f3751j = true;
                h(kVar);
                return j4 != -1 ? j4 : this.f3750i;
            } catch (x e5) {
                throw e5;
            } catch (IOException e6) {
                throw new x(2000, null, e6);
            }
        } catch (Resources.NotFoundException e7) {
            throw new x(2005, null, e7);
        }
    }

    @Override // Y.h
    public final void close() {
        this.f3747f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f3749h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3749h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3748g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new x(2000, null, e4);
                    }
                } finally {
                    this.f3748g = null;
                    if (this.f3751j) {
                        this.f3751j = false;
                        f();
                    }
                }
            } catch (IOException e5) {
                throw new x(2000, null, e5);
            }
        } catch (Throwable th) {
            this.f3749h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3748g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3748g = null;
                    if (this.f3751j) {
                        this.f3751j = false;
                        f();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new x(2000, null, e6);
                }
            } finally {
                this.f3748g = null;
                if (this.f3751j) {
                    this.f3751j = false;
                    f();
                }
            }
        }
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f3750i;
        if (j4 != 0) {
            if (j4 != -1) {
                try {
                    i5 = (int) Math.min(j4, i5);
                } catch (IOException e4) {
                    throw new x(2000, null, e4);
                }
            }
            FileInputStream fileInputStream = this.f3749h;
            String str = J.f3263a;
            int read = fileInputStream.read(bArr, i4, i5);
            if (read != -1) {
                long j5 = this.f3750i;
                if (j5 != -1) {
                    this.f3750i = j5 - read;
                }
                a(read);
                return read;
            }
            if (this.f3750i != -1) {
                throw new x(2000, "End of stream reached having not read sufficient data.", new EOFException());
            }
        }
        return -1;
    }
}
