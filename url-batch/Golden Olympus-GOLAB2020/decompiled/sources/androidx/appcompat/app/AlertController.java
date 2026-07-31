package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.J;
import androidx.core.view.AbstractC1281a0;
import androidx.core.widget.NestedScrollView;
import e.AbstractC2405a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A, reason: collision with root package name */
    NestedScrollView f9930A;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f9932C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f9933D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f9934E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f9935F;

    /* renamed from: G, reason: collision with root package name */
    private View f9936G;

    /* renamed from: H, reason: collision with root package name */
    ListAdapter f9937H;

    /* renamed from: J, reason: collision with root package name */
    private int f9939J;

    /* renamed from: K, reason: collision with root package name */
    private int f9940K;

    /* renamed from: L, reason: collision with root package name */
    int f9941L;

    /* renamed from: M, reason: collision with root package name */
    int f9942M;

    /* renamed from: N, reason: collision with root package name */
    int f9943N;

    /* renamed from: O, reason: collision with root package name */
    int f9944O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f9945P;

    /* renamed from: R, reason: collision with root package name */
    Handler f9947R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f9949a;

    /* renamed from: b, reason: collision with root package name */
    final r f9950b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f9951c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9952d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f9953e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f9954f;

    /* renamed from: g, reason: collision with root package name */
    ListView f9955g;

    /* renamed from: h, reason: collision with root package name */
    private View f9956h;

    /* renamed from: i, reason: collision with root package name */
    private int f9957i;

    /* renamed from: j, reason: collision with root package name */
    private int f9958j;

    /* renamed from: k, reason: collision with root package name */
    private int f9959k;

    /* renamed from: l, reason: collision with root package name */
    private int f9960l;

    /* renamed from: m, reason: collision with root package name */
    private int f9961m;

    /* renamed from: o, reason: collision with root package name */
    Button f9963o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f9964p;

    /* renamed from: q, reason: collision with root package name */
    Message f9965q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f9966r;

    /* renamed from: s, reason: collision with root package name */
    Button f9967s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f9968t;

    /* renamed from: u, reason: collision with root package name */
    Message f9969u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f9970v;

    /* renamed from: w, reason: collision with root package name */
    Button f9971w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f9972x;

    /* renamed from: y, reason: collision with root package name */
    Message f9973y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f9974z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9962n = false;

    /* renamed from: B, reason: collision with root package name */
    private int f9931B = 0;

    /* renamed from: I, reason: collision with root package name */
    int f9938I = -1;

    /* renamed from: Q, reason: collision with root package name */
    private int f9946Q = 0;

    /* renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f9948S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f9975a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9976b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f36483c2);
            this.f9976b = obtainStyledAttributes.getDimensionPixelOffset(e.j.f36488d2, -1);
            this.f9975a = obtainStyledAttributes.getDimensionPixelOffset(e.j.f36493e2, -1);
        }

        public void a(boolean z4, boolean z5) {
            if (z5 && z4) {
                return;
            }
            setPadding(getPaddingLeft(), z4 ? getPaddingTop() : this.f9975a, getPaddingRight(), z5 ? getPaddingBottom() : this.f9976b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f9963o || (message3 = alertController.f9965q) == null) ? (view != alertController.f9967s || (message2 = alertController.f9969u) == null) ? (view != alertController.f9971w || (message = alertController.f9973y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f9947R.obtainMessage(1, alertController2.f9950b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public int f9978A;

        /* renamed from: B, reason: collision with root package name */
        public int f9979B;

        /* renamed from: C, reason: collision with root package name */
        public int f9980C;

        /* renamed from: D, reason: collision with root package name */
        public int f9981D;

        /* renamed from: F, reason: collision with root package name */
        public boolean[] f9983F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f9984G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f9985H;

        /* renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f9987J;

        /* renamed from: K, reason: collision with root package name */
        public Cursor f9988K;

        /* renamed from: L, reason: collision with root package name */
        public String f9989L;

        /* renamed from: M, reason: collision with root package name */
        public String f9990M;

        /* renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f9991N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f9993a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f9994b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f9996d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f9998f;

        /* renamed from: g, reason: collision with root package name */
        public View f9999g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f10000h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f10001i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f10002j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f10003k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f10004l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f10005m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f10006n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f10007o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f10008p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f10009q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f10011s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f10012t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f10013u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f10014v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f10015w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f10016x;

        /* renamed from: y, reason: collision with root package name */
        public int f10017y;

        /* renamed from: z, reason: collision with root package name */
        public View f10018z;

        /* renamed from: c, reason: collision with root package name */
        public int f9995c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f9997e = 0;

        /* renamed from: E, reason: collision with root package name */
        public boolean f9982E = false;

        /* renamed from: I, reason: collision with root package name */
        public int f9986I = -1;

        /* renamed from: O, reason: collision with root package name */
        public boolean f9992O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f10010r = true;

        class a extends ArrayAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f10019a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i4, int i5, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i4, i5, charSequenceArr);
                this.f10019a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i4, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i4, view, viewGroup);
                boolean[] zArr = b.this.f9983F;
                if (zArr != null && zArr[i4]) {
                    this.f10019a.setItemChecked(i4, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0076b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            private final int f10021a;

            /* renamed from: b, reason: collision with root package name */
            private final int f10022b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f10023c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f10024d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0076b(Context context, Cursor cursor, boolean z4, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z4);
                this.f10023c = recycleListView;
                this.f10024d = alertController;
                Cursor cursor2 = getCursor();
                this.f10021a = cursor2.getColumnIndexOrThrow(b.this.f9989L);
                this.f10022b = cursor2.getColumnIndexOrThrow(b.this.f9990M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f10021a));
                this.f10023c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f10022b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f9994b.inflate(this.f10024d.f9942M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f10026a;

            c(AlertController alertController) {
                this.f10026a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                b.this.f10016x.onClick(this.f10026a.f9950b, i4);
                if (b.this.f9985H) {
                    return;
                }
                this.f10026a.f9950b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f10028a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f10029b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f10028a = recycleListView;
                this.f10029b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                boolean[] zArr = b.this.f9983F;
                if (zArr != null) {
                    zArr[i4] = this.f10028a.isItemChecked(i4);
                }
                b.this.f9987J.onClick(this.f10029b.f9950b, i4, this.f10028a.isItemChecked(i4));
            }
        }

        public b(Context context) {
            this.f9993a = context;
            this.f9994b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f9994b.inflate(alertController.f9941L, (ViewGroup) null);
            if (!this.f9984G) {
                bVar = this;
                alertController2 = alertController;
                int i4 = bVar.f9985H ? alertController2.f9943N : alertController2.f9944O;
                if (bVar.f9988K != null) {
                    listAdapter = new SimpleCursorAdapter(bVar.f9993a, i4, bVar.f9988K, new String[]{bVar.f9989L}, new int[]{R.id.text1});
                } else {
                    listAdapter = bVar.f10015w;
                    if (listAdapter == null) {
                        listAdapter = new d(bVar.f9993a, i4, R.id.text1, bVar.f10014v);
                    }
                }
            } else if (this.f9988K == null) {
                bVar = this;
                listAdapter = bVar.new a(this.f9993a, alertController.f9942M, R.id.text1, this.f10014v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                listAdapter = bVar.new C0076b(bVar.f9993a, bVar.f9988K, false, recycleListView, alertController2);
            }
            alertController2.f9937H = listAdapter;
            alertController2.f9938I = bVar.f9986I;
            if (bVar.f10016x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.f9987J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f9991N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f9985H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f9984G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f9955g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f9999g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f9998f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f9996d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i4 = this.f9995c;
                if (i4 != 0) {
                    alertController.l(i4);
                }
                int i5 = this.f9997e;
                if (i5 != 0) {
                    alertController.l(alertController.c(i5));
                }
            }
            CharSequence charSequence2 = this.f10000h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f10001i;
            if (charSequence3 == null && this.f10002j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f10003k, null, this.f10002j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f10004l;
            if (charSequence4 != null || this.f10005m != null) {
                alertController2.j(-2, charSequence4, this.f10006n, null, this.f10005m);
            }
            CharSequence charSequence5 = this.f10007o;
            if (charSequence5 != null || this.f10008p != null) {
                alertController2.j(-3, charSequence5, this.f10009q, null, this.f10008p);
            }
            if (this.f10014v != null || this.f9988K != null || this.f10015w != null) {
                b(alertController2);
            }
            View view2 = this.f10018z;
            if (view2 != null) {
                if (this.f9982E) {
                    alertController2.s(view2, this.f9978A, this.f9979B, this.f9980C, this.f9981D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i6 = this.f10017y;
            if (i6 != 0) {
                alertController2.q(i6);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f10031a;

        public c(DialogInterface dialogInterface) {
            this.f10031a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == -3 || i4 == -2 || i4 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f10031a.get(), message.what);
            } else {
                if (i4 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i4, int i5, CharSequence[] charSequenceArr) {
            super(context, i4, i5, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.f9949a = context;
        this.f9950b = rVar;
        this.f9951c = window;
        this.f9947R = new c(rVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, e.j.f36385F, AbstractC2405a.f36197k, 0);
        this.f9939J = obtainStyledAttributes.getResourceId(e.j.f36390G, 0);
        this.f9940K = obtainStyledAttributes.getResourceId(e.j.f36398I, 0);
        this.f9941L = obtainStyledAttributes.getResourceId(e.j.f36406K, 0);
        this.f9942M = obtainStyledAttributes.getResourceId(e.j.f36410L, 0);
        this.f9943N = obtainStyledAttributes.getResourceId(e.j.f36418N, 0);
        this.f9944O = obtainStyledAttributes.getResourceId(e.j.f36402J, 0);
        this.f9945P = obtainStyledAttributes.getBoolean(e.j.f36414M, true);
        this.f9952d = obtainStyledAttributes.getDimensionPixelSize(e.j.f36394H, 0);
        obtainStyledAttributes.recycle();
        rVar.supportRequestWindowFeature(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i4 = this.f9940K;
        return i4 == 0 ? this.f9939J : this.f9946Q == 1 ? i4 : this.f9939J;
    }

    private void o(ViewGroup viewGroup, View view, int i4, int i5) {
        View findViewById = this.f9951c.findViewById(e.f.f36317v);
        View findViewById2 = this.f9951c.findViewById(e.f.f36316u);
        AbstractC1281a0.I0(view, i4, i5);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i4;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f9963o = button;
        button.setOnClickListener(this.f9948S);
        if (TextUtils.isEmpty(this.f9964p) && this.f9966r == null) {
            this.f9963o.setVisibility(8);
            i4 = 0;
        } else {
            this.f9963o.setText(this.f9964p);
            Drawable drawable = this.f9966r;
            if (drawable != null) {
                int i5 = this.f9952d;
                drawable.setBounds(0, 0, i5, i5);
                this.f9963o.setCompoundDrawables(this.f9966r, null, null, null);
            }
            this.f9963o.setVisibility(0);
            i4 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f9967s = button2;
        button2.setOnClickListener(this.f9948S);
        if (TextUtils.isEmpty(this.f9968t) && this.f9970v == null) {
            this.f9967s.setVisibility(8);
        } else {
            this.f9967s.setText(this.f9968t);
            Drawable drawable2 = this.f9970v;
            if (drawable2 != null) {
                int i6 = this.f9952d;
                drawable2.setBounds(0, 0, i6, i6);
                this.f9967s.setCompoundDrawables(this.f9970v, null, null, null);
            }
            this.f9967s.setVisibility(0);
            i4 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f9971w = button3;
        button3.setOnClickListener(this.f9948S);
        if (TextUtils.isEmpty(this.f9972x) && this.f9974z == null) {
            this.f9971w.setVisibility(8);
        } else {
            this.f9971w.setText(this.f9972x);
            Drawable drawable3 = this.f9974z;
            if (drawable3 != null) {
                int i7 = this.f9952d;
                drawable3.setBounds(0, 0, i7, i7);
                this.f9971w.setCompoundDrawables(this.f9974z, null, null, null);
            }
            this.f9971w.setVisibility(0);
            i4 |= 4;
        }
        if (y(this.f9949a)) {
            if (i4 == 1) {
                b(this.f9963o);
            } else if (i4 == 2) {
                b(this.f9967s);
            } else if (i4 == 4) {
                b(this.f9971w);
            }
        }
        if (i4 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f9951c.findViewById(e.f.f36318w);
        this.f9930A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f9930A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f9935F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f9954f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f9930A.removeView(this.f9935F);
        if (this.f9955g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f9930A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f9930A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f9955g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View view = this.f9956h;
        if (view == null) {
            view = this.f9957i != 0 ? LayoutInflater.from(this.f9949a).inflate(this.f9957i, viewGroup, false) : null;
        }
        boolean z4 = view != null;
        if (!z4 || !a(view)) {
            this.f9951c.setFlags(131072, 131072);
        }
        if (!z4) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f9951c.findViewById(e.f.f36309n);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f9962n) {
            frameLayout.setPadding(this.f9958j, this.f9959k, this.f9960l, this.f9961m);
        }
        if (this.f9955g != null) {
            ((LinearLayout.LayoutParams) ((J.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f9936G != null) {
            viewGroup.addView(this.f9936G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f9951c.findViewById(e.f.f36294O).setVisibility(8);
            return;
        }
        this.f9933D = (ImageView) this.f9951c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f9953e) || !this.f9945P) {
            this.f9951c.findViewById(e.f.f36294O).setVisibility(8);
            this.f9933D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f9951c.findViewById(e.f.f36305j);
        this.f9934E = textView;
        textView.setText(this.f9953e);
        int i4 = this.f9931B;
        if (i4 != 0) {
            this.f9933D.setImageResource(i4);
            return;
        }
        Drawable drawable = this.f9932C;
        if (drawable != null) {
            this.f9933D.setImageDrawable(drawable);
        } else {
            this.f9934E.setPadding(this.f9933D.getPaddingLeft(), this.f9933D.getPaddingTop(), this.f9933D.getPaddingRight(), this.f9933D.getPaddingBottom());
            this.f9933D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f9951c.findViewById(e.f.f36315t);
        View findViewById4 = findViewById3.findViewById(e.f.f36295P);
        View findViewById5 = findViewById3.findViewById(e.f.f36308m);
        View findViewById6 = findViewById3.findViewById(e.f.f36306k);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(e.f.f36310o);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(e.f.f36295P);
        View findViewById8 = viewGroup.findViewById(e.f.f36308m);
        View findViewById9 = viewGroup.findViewById(e.f.f36306k);
        ViewGroup h4 = h(findViewById7, findViewById4);
        ViewGroup h5 = h(findViewById8, findViewById5);
        ViewGroup h6 = h(findViewById9, findViewById6);
        u(h5);
        t(h6);
        w(h4);
        boolean z4 = viewGroup.getVisibility() != 8;
        boolean z5 = (h4 == null || h4.getVisibility() == 8) ? 0 : 1;
        boolean z6 = (h6 == null || h6.getVisibility() == 8) ? false : true;
        if (!z6 && h5 != null && (findViewById2 = h5.findViewById(e.f.f36290K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z5 != 0) {
            NestedScrollView nestedScrollView = this.f9930A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f9954f == null && this.f9955g == null) ? null : h4.findViewById(e.f.f36293N);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (h5 != null && (findViewById = h5.findViewById(e.f.f36291L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f9955g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z5, z6);
        }
        if (!z4) {
            View view = this.f9955g;
            if (view == null) {
                view = this.f9930A;
            }
            if (view != null) {
                o(h5, view, z5 | (z6 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f9955g;
        if (listView2 == null || (listAdapter = this.f9937H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i4 = this.f9938I;
        if (i4 > -1) {
            listView2.setItemChecked(i4, true);
            listView2.setSelection(i4);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC2405a.f36196j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i4) {
        TypedValue typedValue = new TypedValue();
        this.f9949a.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f9955g;
    }

    public void e() {
        this.f9950b.setContentView(i());
        x();
    }

    public boolean f(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f9930A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public boolean g(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f9930A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public void j(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f9947R.obtainMessage(i4, onClickListener);
        }
        if (i4 == -3) {
            this.f9972x = charSequence;
            this.f9973y = message;
            this.f9974z = drawable;
        } else if (i4 == -2) {
            this.f9968t = charSequence;
            this.f9969u = message;
            this.f9970v = drawable;
        } else {
            if (i4 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f9964p = charSequence;
            this.f9965q = message;
            this.f9966r = drawable;
        }
    }

    public void k(View view) {
        this.f9936G = view;
    }

    public void l(int i4) {
        this.f9932C = null;
        this.f9931B = i4;
        ImageView imageView = this.f9933D;
        if (imageView != null) {
            if (i4 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f9933D.setImageResource(this.f9931B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f9932C = drawable;
        this.f9931B = 0;
        ImageView imageView = this.f9933D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f9933D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f9954f = charSequence;
        TextView textView = this.f9935F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f9953e = charSequence;
        TextView textView = this.f9934E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i4) {
        this.f9956h = null;
        this.f9957i = i4;
        this.f9962n = false;
    }

    public void r(View view) {
        this.f9956h = view;
        this.f9957i = 0;
        this.f9962n = false;
    }

    public void s(View view, int i4, int i5, int i6, int i7) {
        this.f9956h = view;
        this.f9957i = 0;
        this.f9962n = true;
        this.f9958j = i4;
        this.f9959k = i5;
        this.f9960l = i6;
        this.f9961m = i7;
    }
}
