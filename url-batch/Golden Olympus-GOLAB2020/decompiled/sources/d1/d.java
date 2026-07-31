package d1;

import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f36158a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36159b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36160c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36161d;

    /* renamed from: e, reason: collision with root package name */
    public final long f36162e;

    /* renamed from: f, reason: collision with root package name */
    public final long f36163f;

    /* renamed from: g, reason: collision with root package name */
    public final long f36164g;

    /* renamed from: h, reason: collision with root package name */
    public final long f36165h;

    /* renamed from: i, reason: collision with root package name */
    public final long f36166i;

    /* renamed from: j, reason: collision with root package name */
    public final long f36167j;

    /* renamed from: k, reason: collision with root package name */
    public final int f36168k;

    /* renamed from: l, reason: collision with root package name */
    public final int f36169l;

    /* renamed from: m, reason: collision with root package name */
    public final int f36170m;

    /* renamed from: n, reason: collision with root package name */
    public final long f36171n;

    public d(int i4, int i5, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i6, int i7, int i8, long j12) {
        this.f36158a = i4;
        this.f36159b = i5;
        this.f36160c = j4;
        this.f36161d = j5;
        this.f36162e = j6;
        this.f36163f = j7;
        this.f36164g = j8;
        this.f36165h = j9;
        this.f36166i = j10;
        this.f36167j = j11;
        this.f36168k = i6;
        this.f36169l = i7;
        this.f36170m = i8;
        this.f36171n = j12;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f36158a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f36159b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f36159b / this.f36158a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f36160c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f36161d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f36168k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f36162e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f36165h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f36169l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f36163f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f36170m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f36164g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f36166i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f36167j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f36158a + ", size=" + this.f36159b + ", cacheHits=" + this.f36160c + ", cacheMisses=" + this.f36161d + ", downloadCount=" + this.f36168k + ", totalDownloadSize=" + this.f36162e + ", averageDownloadSize=" + this.f36165h + ", totalOriginalBitmapSize=" + this.f36163f + ", totalTransformedBitmapSize=" + this.f36164g + ", averageOriginalBitmapSize=" + this.f36166i + ", averageTransformedBitmapSize=" + this.f36167j + ", originalBitmapCount=" + this.f36169l + ", transformedBitmapCount=" + this.f36170m + ", timeStamp=" + this.f36171n + '}';
    }
}
