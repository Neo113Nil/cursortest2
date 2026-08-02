package com.neptunesoft.bacdz.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.bacdz.ArabicActivity;
import com.neptunesoft.bacdz.EnglishActivity;
import com.neptunesoft.bacdz.FrenchActivity;
import com.neptunesoft.bacdz.HistoryGeographyActivity;
import com.neptunesoft.bacdz.IslamicActivity;
import com.neptunesoft.bacdz.MathsActivity;
import com.neptunesoft.bacdz.PhilosophyActivity;
import com.neptunesoft.bacdz.PhysicsActivity;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.SciencesActivity;
import com.neptunesoft.bacdz.SplashScreen;
import com.neptunesoft.bacdz.classobjects.Tutorials;
import java.util.List;

/* loaded from: classes4.dex */
public class AdapterTutorials extends RecyclerView.Adapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String fromActivity;
    public static List list;
    static TutorialsHolder tutorialsHolder;
    private ItemClickListener mClickListener;
    private final String[] cours_science = {"sciences_science_1.pdf", "sciences_science_2.pdf", "sciences_science_3.pdf", "sciences_science_4.pdf", "sciences_science_5.pdf", "sciences_science_6.pdf", "sciences_science_7.pdf", "sciences_science_8.pdf", "sciences_science_9.pdf", "sciences_science_10.pdf", "sciences_science_11.pdf", "sciences_science_12.pdf", "sciences_science_13.pdf", "sciences_science_14.pdf", "sciences_science_15.pdf", "sciences_science_16.pdf", "sciences_science_17.pdf", "sciences_science_18.pdf", "sciences_science_19.pdf", "sciences_science_20.pdf", "sciences_science_21.pdf", "sciences_science_22.pdf", "sciences_science_23.pdf", "sciences_science_24.pdf", "sciences_science_25.pdf", "sciences_science_26.pdf", "sciences_science_27.pdf", "sciences_science_28.pdf", "sciences_science_29.pdf", "sciences_science_30.pdf", "sciences_science_31.pdf", "sciences_science_32.pdf", "sciences_science_33.pdf", "sciences_science_34.pdf", "sciences_science_35.pdf", "sciences_science_36.pdf", "sciences_science_37.pdf", "sciences_science_38.pdf", "sciences_science_39.pdf", "sciences_science_40.pdf", "sciences_science_41.pdf", "sciences_science_42.pdf", "sciences_science_43.pdf", "sciences_science_44.pdf", "sciences_science_45.pdf", "sciences_science_46.pdf", "sciences_science_47.pdf", "sciences_science_48.pdf", "sciences_science_49.pdf", "sciences_science_50.pdf", "sciences_science_51.pdf", "sciences_science_52.pdf", "sciences_science_53.pdf", "sciences_science_54.pdf", "sciences_science_55.pdf", "sciences_science_56.pdf", "sciences_science_57.pdf", "sciences_science_58.pdf", "sciences_science_59.pdf"};
    private final String[] cours_math = {"sciences_math_1.pdf", "sciences_math_2.pdf", "sciences_math_3.pdf", "sciences_math_4.pdf", "sciences_math_5.pdf", "sciences_math_6.pdf", "sciences_math_7.pdf", "sciences_math_8.pdf", "sciences_math_9.pdf", "sciences_math_10.pdf", "sciences_math_11.pdf", "sciences_math_12.pdf", "sciences_math_13.pdf"};
    private final String[] cours_phisique = {"sciences_phisique_1.pdf", "sciences_phisique_2.pdf", "sciences_phisique_3.pdf", "sciences_phisique_4.pdf", "sciences_phisique_5.pdf", "sciences_phisique_6.pdf", "sciences_phisique_7.pdf", "sciences_phisique_8.pdf", "sciences_phisique_9.pdf", "sciences_phisique_10.pdf", "sciences_phisique_11.pdf", "sciences_phisique_12.pdf", "sciences_phisique_13.pdf", "sciences_phisique_14.pdf", "sciences_phisique_15.pdf", "sciences_phisique_16.pdf", "sciences_phisique_17.pdf", "sciences_phisique_18.pdf", "sciences_phisique_19.pdf", "sciences_phisique_20.pdf", "sciences_phisique_21.pdf", "sciences_phisique_22.pdf", "sciences_phisique_23.pdf", "sciences_phisique_24.pdf", "sciences_phisique_25.pdf"};
    private final String[] cours_arabe = {"sciences_arabe_1.pdf", "sciences_arabe_2.pdf", "sciences_arabe_3.pdf", "sciences_arabe_4.pdf", "sciences_arabe_5.pdf", "sciences_arabe_6.pdf", "sciences_arabe_7.pdf", "sciences_arabe_8.pdf", "sciences_arabe_9.pdf", "sciences_arabe_10.pdf"};
    private final String[] cours_his_geo = {"sciences_his_1.pdf", "sciences_his_2.pdf", "sciences_his_3.pdf", "sciences_geo_1.pdf", "sciences_geo_2.pdf", "sciences_his_geo.pdf"};
    private final String[] cours_islamic = {"sciences_islamic_1.pdf", "sciences_islamic_2.pdf"};
    private final String[] cours_philosophy = {"sciences_philosophy_1.pdf", "sciences_philosophy_2.pdf", "sciences_philosophy_3.pdf", "sciences_philosophy_4.pdf", "sciences_philosophy_5.pdf", "sciences_philosophy_6.pdf", "sciences_philosophy_7.pdf", "sciences_philosophy_8.pdf", "sciences_philosophy_9.pdf", "sciences_philosophy_10.pdf", "sciences_philosophy_11.pdf", "sciences_philosophy_12.pdf", "sciences_philosophy_13.pdf", "sciences_philosophy_14.pdf", "sciences_philosophy_15.pdf", "sciences_philosophy_16.pdf", "sciences_philosophy_17.pdf", "sciences_philosophy_18.pdf", "sciences_philosophy_19.pdf", "sciences_philosophy_20.pdf", "sciences_philosophy_21.pdf", "sciences_philosophy_22.pdf", "sciences_philosophy_23.pdf", "sciences_philosophy_24.pdf", "sciences_philosophy_25.pdf", "sciences_philosophy_26.pdf", "sciences_philosophy_27.pdf", "sciences_philosophy_28.pdf", "sciences_philosophy_29.pdf", "sciences_philosophy_30.pdf", "sciences_philosophy_31.pdf", "sciences_philosophy_32.pdf", "sciences_philosophy_33.pdf", "sciences_philosophy_34.pdf", "sciences_philosophy_35.pdf", "sciences_philosophy_36.pdf", "sciences_philosophy_37.pdf", "sciences_philosophy_38.pdf", "sciences_philosophy_39.pdf", "sciences_philosophy_40.pdf", "sciences_philosophy_41.pdf", "sciences_philosophy_42.pdf", "sciences_philosophy_43.pdf", "sciences_philosophy_44.pdf", "sciences_philosophy_45.pdf", "sciences_philosophy_46.pdf", "sciences_philosophy_47.pdf", "sciences_philosophy_48.pdf", "sciences_philosophy_49.pdf", "sciences_philosophy_50.pdf", "sciences_philosophy_51.pdf", "sciences_philosophy_52.pdf"};
    private final String[] cours_english = {"sciences_english_1.pdf", "sciences_english_2.pdf", "sciences_english_3.pdf", "sciences_english_4.pdf"};
    private final String[] cours_francais = {"sciences_francais_1.pdf", "sciences_francais_2.pdf", "sciences_francais_3.pdf", "sciences_francais_4.pdf"};

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public AdapterTutorials(List list2, String from) {
        list = list2;
        fromActivity = from;
    }

    private static Tutorials preparePlus(Tutorials tutorials) {
        if (SplashScreen.darkmode) {
            return new Tutorials(tutorials.getTutorials(), R.drawable.ic_plus_dark);
        }
        return new Tutorials(tutorials.getTutorials(), R.drawable.ic_plus);
    }

    private static Tutorials prepareBriefcase(Tutorials tutorials) {
        if (SplashScreen.darkmode) {
            return new Tutorials(tutorials.getTutorials(), R.drawable.ic_briefcase_dark);
        }
        return new Tutorials(tutorials.getTutorials(), R.drawable.ic_briefcase);
    }

    public static void changeIslamic() {
        Tutorials preparePlus;
        int bindingAdapterPosition = tutorialsHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            preparePlus = preparePlus(new Tutorials("ملخص شامل لكل الدروس", 0));
        } else {
            preparePlus = bindingAdapterPosition != 1 ? null : preparePlus(new Tutorials("نصائح و إرشادات", 0));
        }
        IslamicActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        tutorialsHolder.imgItemTutorial.setImageResource(preparePlus.getIcon());
    }

    public static void changeArabic() {
        Tutorials preparePlus;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                preparePlus = preparePlus(new Tutorials("ملخص الأدب العربي", 0));
                break;
            case 1:
                preparePlus = preparePlus(new Tutorials("ملخص العربية", 0));
                break;
            case 2:
                preparePlus = preparePlus(new Tutorials("قواعد النحو و الصرف, البلاغة, النصوص, العروض", 0));
                break;
            case 3:
                preparePlus = preparePlus(new Tutorials("1 موضوع مع الحل", 0));
                break;
            case 4:
                preparePlus = preparePlus(new Tutorials("2 موضوع مع الحل", 0));
                break;
            case 5:
                preparePlus = preparePlus(new Tutorials("3 موضوع مع الحل", 0));
                break;
            case 6:
                preparePlus = preparePlus(new Tutorials("4 موضوع مع الحل", 0));
                break;
            case 7:
                preparePlus = preparePlus(new Tutorials("5 موضوع مع الحل", 0));
                break;
            case 8:
                preparePlus = preparePlus(new Tutorials("6 موضوع مع الحل", 0));
                break;
            case 9:
                preparePlus = preparePlus(new Tutorials("7 موضوع مع الحل", 0));
                break;
            default:
                preparePlus = null;
                break;
        }
        ArabicActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        tutorialsHolder.imgItemTutorial.setImageResource(preparePlus.getIcon());
    }

    public static void changeEnglish() {
        Tutorials prepareBriefcase;
        int bindingAdapterPosition = tutorialsHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            prepareBriefcase = prepareBriefcase(new Tutorials("كراس اللغة الإنجليزية", 0));
        } else if (bindingAdapterPosition == 1) {
            prepareBriefcase = preparePlus(new Tutorials("كل ما تحتاجه في اللغة الإنجليزية", 0));
        } else if (bindingAdapterPosition == 2) {
            prepareBriefcase = preparePlus(new Tutorials("ملخص باللغة العربية", 0));
        } else {
            prepareBriefcase = bindingAdapterPosition != 3 ? null : preparePlus(new Tutorials("ملخص التعبير الكتابي", 0));
        }
        EnglishActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changeFrench() {
        Tutorials prepareBriefcase;
        int bindingAdapterPosition = tutorialsHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            prepareBriefcase = prepareBriefcase(new Tutorials("كراس اللغة الفرنسية", 0));
        } else if (bindingAdapterPosition == 1) {
            prepareBriefcase = preparePlus(new Tutorials("ملخص اللغة الفرنسية", 0));
        } else if (bindingAdapterPosition == 2) {
            prepareBriefcase = preparePlus(new Tutorials("خطوات كتابة فقرة في اللغة الفرنسية", 0));
        } else {
            prepareBriefcase = bindingAdapterPosition != 3 ? null : preparePlus(new Tutorials("Compte rendu", 0));
        }
        FrenchActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changeHisGeo() {
        Tutorials preparePlus;
        int bindingAdapterPosition = tutorialsHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            preparePlus = preparePlus(new Tutorials("ملخص مادة التاريخ", 0));
        } else if (bindingAdapterPosition == 1) {
            preparePlus = preparePlus(new Tutorials("مصطلحات, مفاهيم و شخصيات | تاريخ", 0));
        } else if (bindingAdapterPosition == 2) {
            preparePlus = preparePlus(new Tutorials("أهم التواريخ لمادة التاريخ", 0));
        } else if (bindingAdapterPosition == 3) {
            preparePlus = preparePlus(new Tutorials("ملخص مادة جغرافيا", 0));
        } else if (bindingAdapterPosition == 4) {
            preparePlus = preparePlus(new Tutorials("مصطلحات و مفاهيم | جغرافيا", 0));
        } else {
            preparePlus = bindingAdapterPosition != 5 ? null : preparePlus(new Tutorials("جميع الخرائط لمادة الإجتماعيات", 0));
        }
        HistoryGeographyActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        tutorialsHolder.imgItemTutorial.setImageResource(preparePlus.getIcon());
    }

    public static void changeMaths() {
        Tutorials prepareBriefcase;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                prepareBriefcase = prepareBriefcase(new Tutorials("النهايات و الإستمرار", 0));
                break;
            case 1:
                prepareBriefcase = prepareBriefcase(new Tutorials("الإشتقاق", 0));
                break;
            case 2:
                prepareBriefcase = prepareBriefcase(new Tutorials("الدالة الأسية", 0));
                break;
            case 3:
                prepareBriefcase = prepareBriefcase(new Tutorials("الدالة اللوغاريتمية", 0));
                break;
            case 4:
                prepareBriefcase = prepareBriefcase(new Tutorials("المتتاليات", 0));
                break;
            case 5:
                prepareBriefcase = prepareBriefcase(new Tutorials("الإحتمالات", 0));
                break;
            case 6:
                prepareBriefcase = prepareBriefcase(new Tutorials("الأعداد المركبة", 0));
                break;
            case 7:
                prepareBriefcase = prepareBriefcase(new Tutorials("الدوال الأصلية", 0));
                break;
            case 8:
                prepareBriefcase = prepareBriefcase(new Tutorials("الحساب التكاملي", 0));
                break;
            case 9:
                prepareBriefcase = prepareBriefcase(new Tutorials("الجداء السلمي في الفضاء", 0));
                break;
            case 10:
                prepareBriefcase = prepareBriefcase(new Tutorials("المستقيمات و المستويات ( الهندسة ) في الفضاء", 0));
                break;
            case 11:
                prepareBriefcase = preparePlus(new Tutorials("ملخص", 0));
                break;
            case 12:
                prepareBriefcase = preparePlus(new Tutorials("المراجعة النهائية", 0));
                break;
            default:
                prepareBriefcase = null;
                break;
        }
        MathsActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changePhilosophy() {
        Tutorials preparePlus;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                preparePlus = preparePlus(new Tutorials("ملخص مادة الفلسفة", 0));
                break;
            case 1:
                preparePlus = preparePlus(new Tutorials("1 المقارنة بين السؤال العلمي والسؤال الفلسفي", 0));
                break;
            case 2:
                preparePlus = preparePlus(new Tutorials("1 المقارنة بين السؤال و المشكلة", 0));
                break;
            case 3:
                preparePlus = preparePlus(new Tutorials("1 مقال المقارنة بين المشكلة و الاشكالية", 0));
                break;
            case 4:
                preparePlus = preparePlus(new Tutorials("1 مقال المقارنة بين المشكل الفلسفي و الاشكال الفلسفي", 0));
                break;
            case 5:
                preparePlus = preparePlus(new Tutorials("1 مقال المقارنة بين الدهشة و الاحراج في السؤال الفلسفي", 0));
                break;
            case 6:
                preparePlus = preparePlus(new Tutorials("1 مقال جدلي هل لكل سؤال جواب بالضرورة ؟", 0));
                break;
            case 7:
                preparePlus = preparePlus(new Tutorials("1 مقال جدلي هل تقدم العلم سيعود سلبا على الفلسفة ؟", 0));
                break;
            case 8:
                preparePlus = preparePlus(new Tutorials("1 مقال جدلي التهجم على الفلسفة هو في الحقيقة تفلسف", 0));
                break;
            case 9:
                preparePlus = preparePlus(new Tutorials("1 مقال استقصاء عهد الفلسفة قد ولى و لا جدوى من دراستها في عصر التطور التكنولوجي", 0));
                break;
            case 10:
                preparePlus = preparePlus(new Tutorials("2 مقارنة بين الاستدلال الصوري ( الاستنتاج ) و الاستدالل الاستقرائي ( الاستقراء )", 0));
                break;
            case 11:
                preparePlus = preparePlus(new Tutorials("2 مقارنة بين المفهوم و الماصدق", 0));
                break;
            case 12:
                preparePlus = preparePlus(new Tutorials("2 مقارنة بين الاستدلال المباشر و الاستدلال الغير المباشر", 0));
                break;
            case 13:
                preparePlus = preparePlus(new Tutorials("2 مقارنة بين انطباق الفكر مع نفسة و انطباق الفكر مع الواقع", 0));
                break;
            case 14:
                preparePlus = preparePlus(new Tutorials("2 مقال جدلي انطباق الفكر مع نفسة و انطباقه مع الواقع", 0));
                break;
            case 15:
                preparePlus = preparePlus(new Tutorials("2 مقال جدلي هل المنطق الصوري مجرد تحصيل حاصل", 0));
                break;
            case 16:
                preparePlus = preparePlus(new Tutorials("2 مقال جدلي هل يمكن الاستغناء عن الفرض العلمي ؟", 0));
                break;
            case 17:
                preparePlus = preparePlus(new Tutorials("2 مقال جدلي هل الطبيعة تخضع لمبدأ الحتمية خضوعا كليا ؟", 0));
                break;
            case 18:
                preparePlus = preparePlus(new Tutorials("2 مقالة استقصائية ان المنطق الصوري يعصم الفكر من الخطأ", 0));
                break;
            case 19:
                preparePlus = preparePlus(new Tutorials("2 مقالة استقصائية ان التجريب دون فكرة سابقة غير ممكن", 0));
                break;
            case 20:
                preparePlus = preparePlus(new Tutorials("2 مقالة استقصائية ان تطابق الفكر مع نفسه شرط كاف لعدم وقوعه في الخطأ", 0));
                break;
            case 21:
                preparePlus = preparePlus(new Tutorials("2 مقالة استقصائية لكي يصل الفكر إلى الانطباق مع الواقع لابد أن يأخذ بأحكام مسبقة غير مؤكدة علميا", 0));
                break;
            case 22:
                preparePlus = preparePlus(new Tutorials("3 مقارنة بين الرياضيات الكلاسيكية والرياضيات المعاصرة", 0));
                break;
            case 23:
                preparePlus = preparePlus(new Tutorials("3 مقارنة بين الرياضيات و المنطق", 0));
                break;
            case 24:
                preparePlus = preparePlus(new Tutorials("3 مقارنة بين الرياضيات و العلوم التجريبية", 0));
                break;
            case 25:
                preparePlus = preparePlus(new Tutorials("3 مقارنة بين الحقيقة الرياضية عن الحقيقة التجريبية", 0));
                break;
            case 26:
                preparePlus = preparePlus(new Tutorials("3 مقال جدلي هل يمكن إرجاع الرياضيات إلى أصول منطقية ؟", 0));
                break;
            case 27:
                preparePlus = preparePlus(new Tutorials("3 مقال جدلي هل أصل الرياضيات العقل أم التجربة ؟", 0));
                break;
            case 28:
                preparePlus = preparePlus(new Tutorials("3 مقال جدلي هل المفاهيم الرياضية مطلقة في اليقين ام نسبية ؟", 0));
                break;
            case 29:
                preparePlus = preparePlus(new Tutorials("3 مقال هل معيار الحقيقة في الرياضيات يكمن في البداهة والوضوح أم في اتساق النتائج ؟", 0));
                break;
            case 30:
                preparePlus = preparePlus(new Tutorials("3 مقال جدلي هل اليقين في نتائج العلوم قد بلغ درجة اليقين الرياضي ؟", 0));
                break;
            case 31:
                preparePlus = preparePlus(new Tutorials("3 مقال ان المفاهيم الرياضية أصلها تجريبي", 0));
                break;
            case 32:
                preparePlus = preparePlus(new Tutorials("3 مقال استقصاء أن الحقيقة الرياضية صارت حقيقة منطقية بحتة", 0));
                break;
            case 33:
                preparePlus = preparePlus(new Tutorials("3 مقال استقصاء المعاني الرياضية فطرية وبالتالي مصدرها العقل", 0));
                break;
            case 34:
                preparePlus = preparePlus(new Tutorials("3 مقارنة بين الملاحظة العادية و الملاحظة العلمية", 0));
                break;
            case 35:
                preparePlus = preparePlus(new Tutorials("3 مقال جدلي هل يمكن إخضاع المادة الحية للمنهج التجريبي على غرار المادة الجامدة ... ؟", 0));
                break;
            case 36:
                preparePlus = preparePlus(new Tutorials("3 مقال جدلي هل يمكن تفسير الظواهر الحية تفسيرا غائيا ؟", 0));
                break;
            case 37:
                preparePlus = preparePlus(new Tutorials("3 مقال استقصاء هل يمكن تطبيق المنهج التجريبي على الظواهر الحية", 0));
                break;
            case 38:
                preparePlus = preparePlus(new Tutorials("3 مقال استقصاء البيولوجيا التحليلية ( التشريحية ) تقضي عمليا على موضوع دراستها", 0));
                break;
            case 39:
                preparePlus = preparePlus(new Tutorials("3 مقال جدلي هل يمكن إخضاع الظاهرة الإنسانية للتجريب ؟", 0));
                break;
            case 40:
                preparePlus = preparePlus(new Tutorials("3 مقال جدلي هل لتاريخ مقعدا بين العلوم الأخرى ؟", 0));
                break;
            case 41:
                preparePlus = preparePlus(new Tutorials("3 مقال جدلي هل تعتبر التجربة المقياس الأساسي لعملية العلم ؟", 0));
                break;
            case 42:
                preparePlus = preparePlus(new Tutorials("4 مقال استقصاء من الصعب تطبيق المنهج التجريبي على الظواهر الإنسانية", 0));
                break;
            case 43:
                preparePlus = preparePlus(new Tutorials("4 مقال جدلي هل الشعور بالأنا يتوقف على الغير ؟", 0));
                break;
            case 44:
                preparePlus = preparePlus(new Tutorials("4 مقال استقصاء معرفة الذات تتأسس على التواصل مع الغير", 0));
                break;
            case 45:
                preparePlus = preparePlus(new Tutorials("4 مقال جدلي هل الإنسان مسؤول عن أفعاله في كل الأحوال ؟", 0));
                break;
            case 46:
                preparePlus = preparePlus(new Tutorials("4 مقال جدلي هل الحرية مجرد وهم ؟", 0));
                break;
            case 47:
                preparePlus = preparePlus(new Tutorials("4 مقال جدلي هل الحرية شرط تأسيس المسؤولية ام المسؤولية شرط وجود الحرية ؟", 0));
                break;
            case 48:
                preparePlus = preparePlus(new Tutorials("4 مقال جدلي هل المجرم هو المسؤول الوحيد عن جرائمه ؟", 0));
                break;
            case 49:
                preparePlus = preparePlus(new Tutorials("4 مقال جدلي هل الحرية مجرد حالة شعورية ام هى ممارسة عملية في الحياة اليومية اساسها التحرر ؟", 0));
                break;
            case 50:
                preparePlus = preparePlus(new Tutorials("4 مقال استقصاء قيل أن الإنسان حر حرية مطلقة دافع", 0));
                break;
            case 51:
                preparePlus = preparePlus(new Tutorials("4 مقال استقصاء قيل ان الحتمية أساس الحرية أثبت بالبرهان صحة هذه الأطروحة اثبت", 0));
                break;
            default:
                preparePlus = null;
                break;
        }
        PhilosophyActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        tutorialsHolder.imgItemTutorial.setImageResource(preparePlus.getIcon());
    }

    public static void changePhysics() {
        Tutorials prepareBriefcase;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                prepareBriefcase = prepareBriefcase(new Tutorials("1 المتابعة الزمنية لتحول كيميائي", R.drawable.ic_briefcase_dark));
                break;
            case 1:
                prepareBriefcase = prepareBriefcase(new Tutorials("2 المتابعة الزمنية لتحول كيميائي", R.drawable.ic_briefcase_dark));
                break;
            case 2:
                prepareBriefcase = prepareBriefcase(new Tutorials("1 التحولات النووية", R.drawable.ic_briefcase_dark));
                break;
            case 3:
                prepareBriefcase = prepareBriefcase(new Tutorials("2 التحولات النووية", R.drawable.ic_briefcase_dark));
                break;
            case 4:
                prepareBriefcase = prepareBriefcase(new Tutorials("1 الظواهر الكهربائية | الدارة RC", R.drawable.ic_briefcase_dark));
                break;
            case 5:
                prepareBriefcase = prepareBriefcase(new Tutorials("2 الظواهر الكهربائية | الدارة RL", R.drawable.ic_briefcase_dark));
                break;
            case 6:
                prepareBriefcase = prepareBriefcase(new Tutorials("1 تطور جملة كيميائية نحو حالة توازن", R.drawable.ic_briefcase_dark));
                break;
            case 7:
                prepareBriefcase = prepareBriefcase(new Tutorials("2 تطور جملة كيميائية نحو حالة توازن", R.drawable.ic_briefcase_dark));
                break;
            case 8:
                prepareBriefcase = prepareBriefcase(new Tutorials("3 تطور جملة كيميائية نحو حالة توازن", R.drawable.ic_briefcase_dark));
                break;
            case 9:
                prepareBriefcase = prepareBriefcase(new Tutorials("1 تطور جملة ميكانيكية", R.drawable.ic_briefcase_dark));
                break;
            case 10:
                prepareBriefcase = prepareBriefcase(new Tutorials("2 تطور جملة ميكانيكية", R.drawable.ic_briefcase_dark));
                break;
            case 11:
                prepareBriefcase = prepareBriefcase(new Tutorials("3 تطور جملة ميكانيكية", R.drawable.ic_briefcase_dark));
                break;
            case 12:
                prepareBriefcase = prepareBriefcase(new Tutorials("1 مراقبة تطور جملة كيميائية بتطور جملة كيميائية", R.drawable.ic_briefcase_dark));
                break;
            case 13:
                prepareBriefcase = prepareBriefcase(new Tutorials("2 مراقبة تطور جملة كيميائية بتطور جملة كيميائية", R.drawable.ic_briefcase_dark));
                break;
            case 14:
                prepareBriefcase = prepareBriefcase(new Tutorials("3 مراقبة تطور جملة كيميائية بتطور جملة كيميائية", R.drawable.ic_briefcase_dark));
                break;
            case 15:
                prepareBriefcase = prepareBriefcase(new Tutorials("1 التطورات المهتزة", R.drawable.ic_briefcase_dark));
                break;
            case 16:
                prepareBriefcase = prepareBriefcase(new Tutorials("2 التطورات المهتزة", R.drawable.ic_briefcase_dark));
                break;
            case 17:
                prepareBriefcase = preparePlus(new Tutorials("ملخص لكل الوحدات", R.drawable.ic_plus_dark));
                break;
            case 18:
                prepareBriefcase = preparePlus(new Tutorials("تمارين + الحلول | الوحدة الأولى", R.drawable.ic_plus_dark));
                break;
            case 19:
                prepareBriefcase = preparePlus(new Tutorials("تمارين + الحلول | الوحدة الثانية", R.drawable.ic_plus_dark));
                break;
            case 20:
                prepareBriefcase = preparePlus(new Tutorials("تمارين + الحلول | الوحدة الثالثة", R.drawable.ic_plus_dark));
                break;
            case 21:
                prepareBriefcase = preparePlus(new Tutorials("تمارين + الحلول | الوحدة الرابعة", R.drawable.ic_plus_dark));
                break;
            case 22:
                prepareBriefcase = preparePlus(new Tutorials("تمارين + الحلول | الوحدة الخامسة", R.drawable.ic_plus_dark));
                break;
            case 23:
                prepareBriefcase = preparePlus(new Tutorials("تمارين + الحلول | الوحدة السادسة", R.drawable.ic_plus_dark));
                break;
            case 24:
                prepareBriefcase = preparePlus(new Tutorials("تمارين + الحلول | الوحدة السابعة", R.drawable.ic_plus_dark));
                break;
            default:
                prepareBriefcase = null;
                break;
        }
        PhysicsActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changeSciences() {
        Tutorials prepareBriefcase;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                prepareBriefcase = prepareBriefcase(new Tutorials("01 مقر تركيب البروتين", 0));
                break;
            case 1:
                prepareBriefcase = prepareBriefcase(new Tutorials("01 استنساخ المعلومات الوراثية", 0));
                break;
            case 2:
                prepareBriefcase = prepareBriefcase(new Tutorials("01 الترجمة", 0));
                break;
            case 3:
                prepareBriefcase = prepareBriefcase(new Tutorials("01 مراحل الترجمة", 0));
                break;
            case 4:
                prepareBriefcase = preparePlus(new Tutorials("01 ملخص رقم 1", 0));
                break;
            case 5:
                prepareBriefcase = preparePlus(new Tutorials("01 ملخص رقم 2", 0));
                break;
            case 6:
                prepareBriefcase = preparePlus(new Tutorials("01 ملخص رقم 3", 0));
                break;
            case 7:
                prepareBriefcase = prepareBriefcase(new Tutorials("02 تمثيل البنية الفراغية للبروتين", 0));
                break;
            case 8:
                prepareBriefcase = preparePlus(new Tutorials("02 ملخص رقم 1", 0));
                break;
            case 9:
                prepareBriefcase = preparePlus(new Tutorials("02 ملخص رقم 2", 0));
                break;
            case 10:
                prepareBriefcase = preparePlus(new Tutorials("02 ملخص رقم 3", 0));
                break;
            case 11:
                prepareBriefcase = prepareBriefcase(new Tutorials("03 مفهوم الإنزيم و أهميته", 0));
                break;
            case 12:
                prepareBriefcase = prepareBriefcase(new Tutorials("03 نشاط الإنزيم و علاقته ببنية الإنزيم", 0));
                break;
            case 13:
                prepareBriefcase = prepareBriefcase(new Tutorials("03 تأثير الـ pH على نشاط الإنزيم", 0));
                break;
            case 14:
                prepareBriefcase = prepareBriefcase(new Tutorials("03 تأثير درجة الحرارة على نشاط الإنزيم", 0));
                break;
            case 15:
                prepareBriefcase = preparePlus(new Tutorials("03 ملخص رقم 1", 0));
                break;
            case 16:
                prepareBriefcase = preparePlus(new Tutorials("03 ملخص رقم 2", 0));
                break;
            case 17:
                prepareBriefcase = preparePlus(new Tutorials("03 ملخص رقم 3", 0));
                break;
            case 18:
                prepareBriefcase = prepareBriefcase(new Tutorials("04 الإستجابة المناعية", 0));
                break;
            case 19:
                prepareBriefcase = prepareBriefcase(new Tutorials("04 الذات و اللاذات", 0));
                break;
            case 20:
                prepareBriefcase = prepareBriefcase(new Tutorials("04 طرق التعرف على محددات المستضد", 0));
                break;
            case 21:
                prepareBriefcase = prepareBriefcase(new Tutorials("04 المعقد المناعـي", 0));
                break;
            case 22:
                prepareBriefcase = prepareBriefcase(new Tutorials("04 مصدر الأجسام المضادة", 0));
                break;
            case 23:
                prepareBriefcase = prepareBriefcase(new Tutorials("04 العناصر الدفاعية في الحالة الثانية", 0));
                break;
            case 24:
                prepareBriefcase = prepareBriefcase(new Tutorials("04 طرق تأثير اللمفاويات LT", 0));
                break;
            case 25:
                prepareBriefcase = prepareBriefcase(new Tutorials("04 مصدر اللمفاويات LT", 0));
                break;
            case 26:
                prepareBriefcase = prepareBriefcase(new Tutorials("04 سبب فقدان المناعة المكتسبة SIDA", 0));
                break;
            case 27:
                prepareBriefcase = preparePlus(new Tutorials("04 ملخص رقم 1", 0));
                break;
            case 28:
                prepareBriefcase = preparePlus(new Tutorials("04 ملخص رقم 2", 0));
                break;
            case 29:
                prepareBriefcase = preparePlus(new Tutorials("04 ملخص رقم 3", 0));
                break;
            case 30:
                prepareBriefcase = prepareBriefcase(new Tutorials("05 النقل المشبكي", 0));
                break;
            case 31:
                prepareBriefcase = prepareBriefcase(new Tutorials("05 آلية النقل المشبكي", 0));
                break;
            case 32:
                prepareBriefcase = prepareBriefcase(new Tutorials("05 كمون الراحة", 0));
                break;
            case 33:
                prepareBriefcase = prepareBriefcase(new Tutorials("05 كمون العمل", 0));
                break;
            case 34:
                prepareBriefcase = prepareBriefcase(new Tutorials("05 آلية الإدماج العصبي", 0));
                break;
            case 35:
                prepareBriefcase = prepareBriefcase(new Tutorials("05 تأثير المخدرات على مستوى المشابك", 0));
                break;
            case 36:
                prepareBriefcase = preparePlus(new Tutorials("05 ملخص رقم 1", 0));
                break;
            case 37:
                prepareBriefcase = preparePlus(new Tutorials("05 ملخص رقم 2", 0));
                break;
            case 38:
                prepareBriefcase = preparePlus(new Tutorials("05 ملخص رقم 3", 0));
                break;
            case 39:
                prepareBriefcase = prepareBriefcase(new Tutorials("06 شروط عملية التركيب الضوئي و مظاهره", 0));
                break;
            case 40:
                prepareBriefcase = prepareBriefcase(new Tutorials("06 مقر عملية التركيب الضوئي", 0));
                break;
            case 41:
                prepareBriefcase = prepareBriefcase(new Tutorials("06 تفاعلات المرحلة الكيمو ضوئية", 0));
                break;
            case 42:
                prepareBriefcase = prepareBriefcase(new Tutorials("06 تفاعلات المرحلة الكيمو حيوية", 0));
                break;
            case 43:
                prepareBriefcase = preparePlus(new Tutorials("06 ملخص رقم 1", 0));
                break;
            case 44:
                prepareBriefcase = preparePlus(new Tutorials("06 ملخص رقم 2", 0));
                break;
            case 45:
                prepareBriefcase = prepareBriefcase(new Tutorials("07 آليات تحويل الطاقة الكامنة في الوسط الهوائي", 0));
                break;
            case 46:
                prepareBriefcase = prepareBriefcase(new Tutorials("07 مقر الأكسدة التنفسية", 0));
                break;
            case 47:
                prepareBriefcase = preparePlus(new Tutorials("07 ملخص رقم 1", 0));
                break;
            case 48:
                prepareBriefcase = preparePlus(new Tutorials("07 ملخص رقم 2", 0));
                break;
            case 49:
                prepareBriefcase = prepareBriefcase(new Tutorials("08 النشاط التكتوني للصفائح", 0));
                break;
            case 50:
                prepareBriefcase = prepareBriefcase(new Tutorials("08 النشاط التكتوني و البنيات الجيولوجية المرتبطة به", 0));
                break;
            case 51:
                prepareBriefcase = preparePlus(new Tutorials("ملخص كل الدروس", 0));
                break;
            case 52:
                prepareBriefcase = preparePlus(new Tutorials("ملخص هام لجميع الوحدات التعلمية", 0));
                break;
            case 53:
                prepareBriefcase = preparePlus(new Tutorials("أهم الأسئلة في البكالوريا و أجوبتها", 0));
                break;
            case 54:
                prepareBriefcase = preparePlus(new Tutorials("نصائح منهجية حول الفروض والاختبارات", 0));
                break;
            case 55:
                prepareBriefcase = preparePlus(new Tutorials("منهجية الإجابة على الأسئلة", 0));
                break;
            case 56:
                prepareBriefcase = preparePlus(new Tutorials("منهجية الاجابة على أسئلة التحليل والاستنتاج", 0));
                break;
            case 57:
                prepareBriefcase = preparePlus(new Tutorials("الأخطاء الشائعة و كيفية تفاديها", 0));
                break;
            case 58:
                prepareBriefcase = preparePlus(new Tutorials("الأخطاء الشائعة في إجابات البكالوريا", 0));
                break;
            default:
                prepareBriefcase = null;
                break;
        }
        SciencesActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final TutorialsHolder tutorialsHolder2 = new TutorialsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tutorials, parent, false));
        tutorialsHolder = tutorialsHolder2;
        tutorialsHolder2.lytItemtutorial.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.adapter.AdapterTutorials$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterTutorials.this.m767x8c595284(tutorialsHolder2, view);
            }
        });
        return tutorialsHolder;
    }

    /* renamed from: lambda$onCreateViewHolder$0$com-neptunesoft-bacdz-adapter-AdapterTutorials, reason: not valid java name */
    /* synthetic */ void m767x8c595284(TutorialsHolder tutorialsHolder2, View view) {
        tutorialsHolder = tutorialsHolder2;
        String str = fromActivity;
        str.hashCode();
        switch (str) {
            case "english":
                String str2 = this.cours_english[tutorialsHolder2.getBindingAdapterPosition()];
                EnglishActivity.file_Name = str2;
                EnglishActivity.getInstance().openContent(str2);
                break;
            case "arabic":
                String str3 = this.cours_arabe[tutorialsHolder2.getBindingAdapterPosition()];
                ArabicActivity.file_Name = str3;
                ArabicActivity.getInstance().openContent(str3);
                break;
            case "french":
                String str4 = this.cours_francais[tutorialsHolder2.getBindingAdapterPosition()];
                FrenchActivity.file_Name = str4;
                FrenchActivity.getInstance().openContent(str4);
                break;
            case "hisgeo":
                String str5 = this.cours_his_geo[tutorialsHolder2.getBindingAdapterPosition()];
                HistoryGeographyActivity.file_Name = str5;
                HistoryGeographyActivity.getInstance().openContent(str5);
                break;
            case "philosophy":
                String str6 = this.cours_philosophy[tutorialsHolder2.getBindingAdapterPosition()];
                PhilosophyActivity.file_Name = str6;
                PhilosophyActivity.getInstance().openContent(str6);
                break;
            case "sciences":
                String str7 = this.cours_science[tutorialsHolder2.getBindingAdapterPosition()];
                SciencesActivity.file_Name = str7;
                SciencesActivity.getInstance().openContent(str7);
                break;
            case "physics":
                String str8 = this.cours_phisique[tutorialsHolder2.getBindingAdapterPosition()];
                PhysicsActivity.file_Name = str8;
                PhysicsActivity.getInstance().openContent(str8);
                break;
            case "maths":
                String str9 = this.cours_math[tutorialsHolder2.getBindingAdapterPosition()];
                MathsActivity.file_Name = str9;
                MathsActivity.getInstance().openContent(str9);
                break;
            case "islamic":
                String str10 = this.cours_islamic[tutorialsHolder2.getBindingAdapterPosition()];
                IslamicActivity.file_Name = str10;
                IslamicActivity.getInstance().openContent(str10);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Tutorials tutorials = (Tutorials) list.get(position);
        TutorialsHolder tutorialsHolder2 = (TutorialsHolder) holder;
        tutorialsHolder2.txtTutorial.setText(tutorials.getTutorials());
        tutorialsHolder2.imgItemTutorial.setImageResource(tutorials.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return list.size();
    }

    public class TutorialsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgItemTutorial;
        LinearLayout lytItemtutorial;
        TextView txtTutorial;

        TutorialsHolder(View itemView) {
            super(itemView);
            this.txtTutorial = (TextView) itemView.findViewById(R.id.txtTutorial);
            this.imgItemTutorial = (ImageView) itemView.findViewById(R.id.imgItemTutorial);
            this.lytItemtutorial = (LinearLayout) itemView.findViewById(R.id.lytItemtutorial);
            itemView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AdapterTutorials.this.mClickListener != null) {
                AdapterTutorials.this.mClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }
}
