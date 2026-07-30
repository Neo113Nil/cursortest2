package p000createpolar;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.Constants;
import com.adjust.sdk.network.ErrorCodes;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageConstraintSetClonePixelVortex4921 {
    public static final PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageBitmapVisionAuroraPixel4705;
    public static int PolarVoyageBottomSheetOmegaNeo1907;
    public static PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageDiffUtilTurboStrike5735;
    public static String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public static final int[] PolarVoyageZipVortexCelestial6185 = {2002, 2000, 1920, 1601, 1600, ErrorCodes.SERVER_RETRY_IN, 1000, 960, 800, 800, 480, Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE, 2048};
    public static final PolarVoyageAssetManagerEclipseHyperInferno7091 PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageAssetManagerEclipseHyperInferno7091("CLOSED", 3);
    public static final float[] PolarVoyageKotlinBetaPulseBeta3653 = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] PolarVoyageBarcodeScannerInfernoSolarSpark7767 = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final PolarVoyageWithContextGammaMaster7108 PolarVoyageTextInputEditTextNebulaHero6651 = new PolarVoyageWithContextGammaMaster7108(23);
    public static final Object PolarVoyageItemDecorationUltraDeltaEpic7485 = new Object();
    public static final char[] PolarVoyageStrictModeLegendEpic1532 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        Object obj = null;
        PolarVoyageBitmapVisionAuroraPixel4705 = new PolarVoyageAlarmManagerAlphaInferno3493(obj, obj, obj, 24);
    }

    public static boolean PolarVoyageActivityInfoBetaQuantum8726() {
        try {
            if (PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageFirebaseModelDownloadConditionsLegendHyperionHyper7575 == null) {
                PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageFirebaseModelDownloadConditionsLegendHyperionHyper7575 = Class.forName("android.os.SystemProperties");
            }
            if (PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageAnimatorTitaniumUltra3241 == null) {
                Class cls = PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageFirebaseModelDownloadConditionsLegendHyperionHyper7575;
                PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageAnimatorTitaniumUltra3241 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageAnimatorTitaniumUltra3241;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean PolarVoyageAlarmManagerShadowHyperBeta8339(PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354, PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492) {
        int i;
        PolarVoyageInputFilterLegendMaster1587 polarVoyageInputFilterLegendMaster1587;
        Object PolarVoyageZipVortexCelestial61852;
        PolarVoyageDiffUtilGammaForce7187 PolarVoyageBottomSheetOmegaNeo19072;
        boolean PolarVoyageStrictModeLegendEpic15322;
        do {
            synchronized (PolarVoyageItemDecorationUltraDeltaEpic7485) {
                PolarVoyageObserverSolarOmegaLegend8594 polarVoyageObserverSolarOmegaLegend8594 = polarVoyageOrientationSensorEpicHeroNova6354.PolarVoyageItemDecorationUltraDeltaEpic7485;
                polarVoyageObserverSolarOmegaLegend8594.getClass();
                PolarVoyageObserverSolarOmegaLegend8594 polarVoyageObserverSolarOmegaLegend85942 = (PolarVoyageObserverSolarOmegaLegend8594) PolarVoyageLaunchOmegaDragon4995.PolarVoyageStrictModeLegendEpic1532(polarVoyageObserverSolarOmegaLegend8594);
                i = polarVoyageObserverSolarOmegaLegend85942.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                polarVoyageInputFilterLegendMaster1587 = polarVoyageObserverSolarOmegaLegend85942.PolarVoyageKotlinBetaPulseBeta3653;
            }
            polarVoyageInputFilterLegendMaster1587.getClass();
            PolarVoyageScaleDrawableEclipseQuantumCosmos2012 PolarVoyageDiffUtilTurboStrike57352 = polarVoyageInputFilterLegendMaster1587.PolarVoyageDiffUtilTurboStrike5735();
            PolarVoyageZipVortexCelestial61852 = polarVoyageStateFlowNebulaMax1492.PolarVoyageZipVortexCelestial6185(PolarVoyageDiffUtilTurboStrike57352);
            PolarVoyageInputFilterLegendMaster1587 PolarVoyageBarcodeScannerInfernoSolarSpark77672 = PolarVoyageDiffUtilTurboStrike57352.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBarcodeScannerInfernoSolarSpark77672, polarVoyageInputFilterLegendMaster1587)) {
                break;
            }
            PolarVoyageObserverSolarOmegaLegend8594 polarVoyageObserverSolarOmegaLegend85943 = polarVoyageOrientationSensorEpicHeroNova6354.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageObserverSolarOmegaLegend85943.getClass();
            synchronized (PolarVoyageLaunchOmegaDragon4995.PolarVoyageKotlinBetaPulseBeta3653) {
                PolarVoyageBottomSheetOmegaNeo19072 = PolarVoyageLaunchOmegaDragon4995.PolarVoyageBottomSheetOmegaNeo1907();
                PolarVoyageStrictModeLegendEpic15322 = PolarVoyageStrictModeLegendEpic1532((PolarVoyageObserverSolarOmegaLegend8594) PolarVoyageLaunchOmegaDragon4995.PolarVoyageMotionLayoutForceEpicAurora7183(polarVoyageObserverSolarOmegaLegend85943, polarVoyageOrientationSensorEpicHeroNova6354, PolarVoyageBottomSheetOmegaNeo19072), i, PolarVoyageBarcodeScannerInfernoSolarSpark77672, true);
            }
            PolarVoyageLaunchOmegaDragon4995.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageBottomSheetOmegaNeo19072, polarVoyageOrientationSensorEpicHeroNova6354);
        } while (!PolarVoyageStrictModeLegendEpic15322);
        return ((Boolean) PolarVoyageZipVortexCelestial61852).booleanValue();
    }

    public static void PolarVoyageAlertDialogCyberHeroQuantum3938(int i, PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageToolbarEclipseInfernoHero6368(7);
        byte[] bArr = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static final PolarVoyageCardViewNebulaTitanGamma6305 PolarVoyageAlertDialogNovaXCelestial4954(PolarVoyageRemoteModelManagerSpectraShadowNeo2910 polarVoyageRemoteModelManagerSpectraShadowNeo2910, int i) {
        PolarVoyageCardViewNebulaTitanGamma6305 polarVoyageCardViewNebulaTitanGamma6305 = ((PolarVoyageGyroscopePulseAurora9729) polarVoyageRemoteModelManagerSpectraShadowNeo2910).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageSnackbarGammaEclipse2140;
        polarVoyageCardViewNebulaTitanGamma6305.getClass();
        if (polarVoyageCardViewNebulaTitanGamma6305.PolarVoyageClipDrawableLegendTitanium3361() != polarVoyageRemoteModelManagerSpectraShadowNeo2910 || !PolarVoyageExecutorOmegaLegend2799.PolarVoyageTextInputEditTextNebulaHero6651(i)) {
            return polarVoyageCardViewNebulaTitanGamma6305;
        }
        PolarVoyageCardViewNebulaTitanGamma6305 polarVoyageCardViewNebulaTitanGamma63052 = polarVoyageCardViewNebulaTitanGamma6305.PolarVoyageMotionLayoutForceEpicAurora7183;
        polarVoyageCardViewNebulaTitanGamma63052.getClass();
        return polarVoyageCardViewNebulaTitanGamma63052;
    }

    public static boolean PolarVoyageAnimatorSetSparkUltraMax8233() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
            PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
            PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185();
            Context context = PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final PolarVoyageGyroscopePulseAurora9729 PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDigitalInkRecognitionBetaDelta4802 polarVoyageDigitalInkRecognitionBetaDelta4802) {
        int i;
        if (polarVoyageDigitalInkRecognitionBetaDelta4802 == null || (i = polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageRotateAnimationCyberCelestialDelta4768) == 0) {
            return null;
        }
        return (PolarVoyageGyroscopePulseAurora9729) polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageBottomSheetOmegaNeo1907(i - 1);
    }

    public static final boolean PolarVoyageBitmapMaxTitanTitan7960(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final void PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static void PolarVoyageBottomSheetOmegaNeo1907(int i) {
        if (2 > i || i >= 37) {
            StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("radix ", i, " was not in valid range ");
            PolarVoyageContentProviderHyperSpark3838.append(new PolarVoyageLinearLayoutHyperionSpectra2647(2, 36, 1));
            throw new IllegalArgumentException(PolarVoyageContentProviderHyperSpark3838.toString());
        }
    }

    public static byte[] PolarVoyageCameraPixelBlaze2629(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final Rect PolarVoyageCameraViewSpectraMaxSpectra2824(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    metricAffectingSpanArr.getClass();
                    int i4 = 0;
                    while (true) {
                        if (!(i4 < metricAffectingSpanArr.length)) {
                            break;
                        }
                        int i5 = i4 + 1;
                        try {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i4];
                            if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                                metricAffectingSpan.updateMeasureState(textPaint2);
                            }
                            i4 = i5;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532(e.getMessage());
                            return null;
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PolarVoyageFontFamilyMegaGammaDragon3290 PolarVoyageCanvasElitePhoenix4750(PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087) {
        int i;
        int i2;
        int PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
        int PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
        if (PolarVoyageTextInputEditTextNebulaHero66513 == 65535) {
            PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = PolarVoyageTextInputEditTextNebulaHero66513 + i;
        if (PolarVoyageTextInputEditTextNebulaHero66512 == 44097) {
            i3 += 2;
        }
        if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2) == 3) {
            do {
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
            } while (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735());
        }
        int PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(10);
        if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735() && polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(3) > 0) {
            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(2);
        }
        int i4 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735() ? 48000 : 44100;
        int PolarVoyageTextInputEditTextNebulaHero66515 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(4);
        int[] iArr = PolarVoyageZipVortexCelestial6185;
        if (i4 == 44100 && PolarVoyageTextInputEditTextNebulaHero66515 == 13) {
            i2 = iArr[PolarVoyageTextInputEditTextNebulaHero66515];
        } else if (i4 != 48000 || PolarVoyageTextInputEditTextNebulaHero66515 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[PolarVoyageTextInputEditTextNebulaHero66515];
            int i6 = PolarVoyageTextInputEditTextNebulaHero66514 % 5;
            if (i6 != 1) {
                if (i6 == 2) {
                    if (PolarVoyageTextInputEditTextNebulaHero66515 != 8) {
                    }
                    i2 = i5 + 1;
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        if (PolarVoyageTextInputEditTextNebulaHero66515 != 3) {
                            if (PolarVoyageTextInputEditTextNebulaHero66515 != 8) {
                            }
                        }
                        i2 = i5 + 1;
                    }
                    i2 = i5;
                }
            }
            if (PolarVoyageTextInputEditTextNebulaHero66515 != 3) {
            }
            i2 = i5 + 1;
        }
        return new PolarVoyageFontFamilyMegaGammaDragon3290(i4, i3, i2);
    }

    public static final boolean PolarVoyageCardViewAlphaVortexCelestial9747(String str, int i, int i2) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageBottomSheetOmegaNeo1907(str.charAt(i + 1)) != -1 && PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageBottomSheetOmegaNeo1907(str.charAt(i3)) != -1;
    }

    public static int PolarVoyageClipboardManagerAuroraPixel8666(Object obj) {
        return PolarVoyageDisplayMetricsForceEclipseVision4728(obj == null ? 0 : obj.hashCode());
    }

    public static final PolarVoyageCardViewNebulaTitanGamma6305 PolarVoyageColorStateListEliteStrikeOlympian8131(PolarVoyageRemoteModelManagerSpectraShadowNeo2910 polarVoyageRemoteModelManagerSpectraShadowNeo2910) {
        if (!((PolarVoyageGyroscopePulseAurora9729) polarVoyageRemoteModelManagerSpectraShadowNeo2910).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDisplayMetricsVortexDragon9516) {
            PolarVoyagePackageManagerUltraQuantumInferno5642.PolarVoyageMotionLayoutTransitionHeroVision4068("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        PolarVoyageCardViewNebulaTitanGamma6305 PolarVoyageAlertDialogNovaXCelestial4954 = PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageRemoteModelManagerSpectraShadowNeo2910, 2);
        if (!PolarVoyageAlertDialogNovaXCelestial4954.PolarVoyageClipDrawableLegendTitanium3361().PolarVoyageDisplayMetricsVortexDragon9516) {
            PolarVoyagePackageManagerUltraQuantumInferno5642.PolarVoyageMotionLayoutTransitionHeroVision4068("LayoutCoordinates is not attached.");
        }
        return PolarVoyageAlertDialogNovaXCelestial4954;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void PolarVoyageConfigurationMaxSpectraForce5418(PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729, PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon8768) {
        PolarVoyageLifecycleTurboPrimeShadow4382 polarVoyageLifecycleTurboPrimeShadow4382 = polarVoyageGyroscopePulseAurora9729.PolarVoyageDrawableDeltaHyperion5742;
        if (polarVoyageLifecycleTurboPrimeShadow4382 == null) {
            polarVoyageLifecycleTurboPrimeShadow4382 = new PolarVoyageLifecycleTurboPrimeShadow4382((PolarVoyageInputFilterBetaFusion3918) polarVoyageGyroscopePulseAurora9729);
            polarVoyageGyroscopePulseAurora9729.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageLifecycleTurboPrimeShadow4382;
        }
        PolarVoyageMotionSceneStormSolarBeta2208(polarVoyageGyroscopePulseAurora9729).getSnapshotObserver().PolarVoyageZipVortexCelestial6185(polarVoyageLifecycleTurboPrimeShadow4382, PolarVoyageRecyclerViewHyperStrike7336.PolarVoyageToolbarEclipseInfernoHero6368, polarVoyageFragmentPulseEliteDragon8768);
    }

    public static PolarVoyageTextViewLegendTurbo6617 PolarVoyageContentProviderHyperSpark3838(String str, String str2) {
        PolarVoyageFirebaseHeroHero8936 polarVoyageFirebaseHeroHero8936 = new PolarVoyageFirebaseHeroHero8936(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(PolarVoyageRotateAnimationBlazePixelTitan5297.PolarVoyageZipVortexCelestial6185(PolarVoyageFirebaseHeroHero8936.class));
        return new PolarVoyageTextViewLegendTurbo6617(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new PolarVoyageDebugUltraVision8286(0, polarVoyageFirebaseHeroHero8936), hashSet3);
    }

    public static String PolarVoyageDatabaseCosmosSpectraSolar3905(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = new PolarVoyageSnackbarSpectraMasterMaster4120();
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(str, i, i5);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(32);
                            i5++;
                        }
                        polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int PolarVoyageBottomSheetOmegaNeo19072 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageBottomSheetOmegaNeo1907(str.charAt(i5 + 1));
                        int PolarVoyageBottomSheetOmegaNeo19073 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageBottomSheetOmegaNeo1907(str.charAt(i4));
                        if (PolarVoyageBottomSheetOmegaNeo19072 != -1 && PolarVoyageBottomSheetOmegaNeo19073 != -1) {
                            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149((PolarVoyageBottomSheetOmegaNeo19072 << 4) + PolarVoyageBottomSheetOmegaNeo19073);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyagePackageManagerCelestialPhoenix8393();
            }
            i5++;
        }
        return str.substring(i, i2);
    }

    public static final PolarVoyageObserverSolarOmegaLegend8594 PolarVoyageDiffUtilDragonSpeedEclipse6225(PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354) {
        PolarVoyageObserverSolarOmegaLegend8594 polarVoyageObserverSolarOmegaLegend8594 = polarVoyageOrientationSensorEpicHeroNova6354.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageObserverSolarOmegaLegend8594.getClass();
        return (PolarVoyageObserverSolarOmegaLegend8594) PolarVoyageLaunchOmegaDragon4995.PolarVoyageBitmapMaxTitanTitan7960(polarVoyageObserverSolarOmegaLegend8594, polarVoyageOrientationSensorEpicHeroNova6354);
    }

    public static final void PolarVoyageDiffUtilTurboStrike5735(View view, ArrayList arrayList, boolean z) {
        int i;
        boolean z2 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z2) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z3 = viewGroup.getDescendantFocusability() == 131072;
        if (z2 && z3) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i2 = 0; i2 < childCount; i2++) {
                viewArr[i2] = viewGroup.getChildAt(i2);
            }
            PolarVoyageLocationManagerLegendHeroTitanium4938 polarVoyageLocationManagerLegendHeroTitanium4938 = PolarVoyageTextWatcherTitanBlazeOmega6781.PolarVoyageZipVortexCelestial6185;
            boolean z4 = viewGroup.getLayoutDirection() == 1;
            PolarVoyageAuthTitaniumMasterElite1113 polarVoyageAuthTitaniumMasterElite1113 = PolarVoyageTextWatcherTitanBlazeOmega6781.PolarVoyageDiffUtilTurboStrike5735;
            PolarVoyageLocationManagerLegendHeroTitanium4938 polarVoyageLocationManagerLegendHeroTitanium49382 = PolarVoyageTextWatcherTitanBlazeOmega6781.PolarVoyageZipVortexCelestial6185;
            PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492 = PolarVoyageTextWatcherTitanBlazeOmega6781.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (childCount < 2) {
                i = 0;
            } else {
                int i3 = childCount - polarVoyageLocationManagerLegendHeroTitanium49382.PolarVoyageMotionLayoutTransitionHeroVision4068;
                i = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    polarVoyageLocationManagerLegendHeroTitanium49382.PolarVoyageZipVortexCelestial6185(new Rect());
                }
                for (int i5 = 0; i5 < childCount; i5++) {
                    View view2 = viewArr[i5];
                    int i6 = PolarVoyageTextWatcherTitanBlazeOmega6781.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    PolarVoyageTextWatcherTitanBlazeOmega6781.PolarVoyageMotionLayoutTransitionHeroVision4068 = i6 + 1;
                    Rect rect = (Rect) polarVoyageLocationManagerLegendHeroTitanium49382.PolarVoyageBitmapVisionAuroraPixel4705(i6);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageCameraPixelBlaze2629(view2, rect);
                }
                PolarVoyageAuthTitaniumMasterElite1113 polarVoyageAuthTitaniumMasterElite11132 = PolarVoyageTextWatcherTitanBlazeOmega6781.PolarVoyageBitmapVisionAuroraPixel4705;
                polarVoyageAuthTitaniumMasterElite11132.getClass();
                if (childCount > 1) {
                    Arrays.sort(viewArr, polarVoyageAuthTitaniumMasterElite11132);
                }
                Object PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(viewArr[0]);
                PolarVoyageTextInputEditTextNebulaHero66512.getClass();
                int i7 = ((Rect) PolarVoyageTextInputEditTextNebulaHero66512).bottom;
                PolarVoyageTextWatcherTitanBlazeOmega6781.PolarVoyageKotlinBetaPulseBeta3653 = z4 ? -1 : 1;
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    Object PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(viewArr[i9]);
                    PolarVoyageTextInputEditTextNebulaHero66513.getClass();
                    Rect rect2 = (Rect) PolarVoyageTextInputEditTextNebulaHero66513;
                    if (rect2.top >= i7) {
                        if (i9 - i8 > 1) {
                            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageLocationListenerInfernoQuantumOlympian6900(viewArr, polarVoyageAuthTitaniumMasterElite1113, i8, i9);
                        }
                        i7 = rect2.bottom;
                        i8 = i9;
                    } else {
                        i7 = Math.max(i7, rect2.bottom);
                    }
                }
                if (childCount - i8 > 1) {
                    PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageLocationListenerInfernoQuantumOlympian6900(viewArr, polarVoyageAuthTitaniumMasterElite1113, i8, childCount);
                }
                PolarVoyageTextWatcherTitanBlazeOmega6781.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
                polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageZipVortexCelestial6185();
            }
            for (int i10 = i; i10 < childCount; i10++) {
                PolarVoyageDiffUtilTurboStrike5735(viewArr[i10], arrayList, z);
            }
        }
        if (z2 && !z3 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static int PolarVoyageDisplayMetricsForceEclipseVision4728(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static final Object PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue7241, long j, PolarVoyageObjectDetectionThunderHyperInferno3620 polarVoyageObjectDetectionThunderHyperInferno3620) {
        while (true) {
            if (polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653 >= j && !polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653()) {
                return polarVoyageRunnableSparkRogue7241;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageGestureDetectorStrikeHyperion4153.PolarVoyageZipVortexCelestial6185;
            Object obj = atomicReferenceFieldUpdater.get(polarVoyageRunnableSparkRogue7241);
            PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (obj == polarVoyageAssetManagerEclipseHyperInferno7091) {
                return polarVoyageAssetManagerEclipseHyperInferno7091;
            }
            PolarVoyageRunnableSparkRogue7241 polarVoyageRunnableSparkRogue72412 = (PolarVoyageRunnableSparkRogue7241) ((PolarVoyageGestureDetectorStrikeHyperion4153) obj);
            if (polarVoyageRunnableSparkRogue72412 == null) {
                polarVoyageRunnableSparkRogue72412 = (PolarVoyageRunnableSparkRogue7241) polarVoyageObjectDetectionThunderHyperInferno3620.PolarVoyageDiffUtilTurboStrike5735(Long.valueOf(polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653 + 1), polarVoyageRunnableSparkRogue7241);
                while (!atomicReferenceFieldUpdater.compareAndSet(polarVoyageRunnableSparkRogue7241, null, polarVoyageRunnableSparkRogue72412)) {
                    if (atomicReferenceFieldUpdater.get(polarVoyageRunnableSparkRogue7241) != null) {
                        break;
                    }
                }
                if (polarVoyageRunnableSparkRogue7241.PolarVoyageKotlinBetaPulseBeta3653()) {
                    polarVoyageRunnableSparkRogue7241.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                }
            }
            polarVoyageRunnableSparkRogue7241 = polarVoyageRunnableSparkRogue72412;
        }
    }

    public static int PolarVoyageDrawableDeltaHyperion5742(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final PolarVoyageMaterialCardViewAlphaUltraForce8502 PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageMaterialCardViewAlphaUltraForce8502 polarVoyageMaterialCardViewAlphaUltraForce8502) {
        PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348 = polarVoyageMaterialCardViewAlphaUltraForce8502.PolarVoyageLayerDrawableShadowTitaniumOmega1942.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        while (true) {
            PolarVoyageConfigurationMegaTitaniumQuantum2348 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageNavigationViewHyperHyperHyperion1793();
            PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum23482 = null;
            if ((PolarVoyageNavigationViewHyperHyperHyperion1793 != null ? PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageDrawableDeltaHyperion5742 : null) == null) {
                PolarVoyageMaterialCardViewAlphaUltraForce8502 PolarVoyageAnimationSetTurboInferno2125 = ((PolarVoyageCardViewNebulaTitanGamma6305) polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageBitmapVisionAuroraPixel4705).PolarVoyageAnimationSetTurboInferno2125();
                PolarVoyageAnimationSetTurboInferno2125.getClass();
                return PolarVoyageAnimationSetTurboInferno2125;
            }
            PolarVoyageConfigurationMegaTitaniumQuantum2348 PolarVoyageNavigationViewHyperHyperHyperion17932 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageNavigationViewHyperHyperHyperion1793();
            if (PolarVoyageNavigationViewHyperHyperHyperion17932 != null) {
                polarVoyageConfigurationMegaTitaniumQuantum23482 = PolarVoyageNavigationViewHyperHyperHyperion17932.PolarVoyageDrawableDeltaHyperion5742;
            }
            polarVoyageConfigurationMegaTitaniumQuantum23482.getClass();
            PolarVoyageConfigurationMegaTitaniumQuantum2348 PolarVoyageNavigationViewHyperHyperHyperion17933 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageNavigationViewHyperHyperHyperion1793();
            PolarVoyageNavigationViewHyperHyperHyperion17933.getClass();
            polarVoyageConfigurationMegaTitaniumQuantum2348 = PolarVoyageNavigationViewHyperHyperHyperion17933.PolarVoyageDrawableDeltaHyperion5742;
            polarVoyageConfigurationMegaTitaniumQuantum2348.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(Intent intent) {
        int parseInt;
        int i;
        String string;
        String string2;
        Object[] objArr;
        String string3;
        String string4;
        long parseLong;
        String str;
        String str2;
        if (PolarVoyageHandlerThreadMaxAurora5064(intent)) {
            PolarVoyageToolbarEclipseInfernoHero6368(intent.getExtras(), "_nr");
        }
        int i2 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : PolarVoyageAnimatorSetSparkUltraMax8233()) {
            PolarVoyageVibratorMegaEclipse4696 polarVoyageVibratorMegaEclipse4696 = (PolarVoyageVibratorMegaEclipse4696) FirebaseMessaging.PolarVoyageBottomSheetOmegaNeo1907.get();
            if (polarVoyageVibratorMegaEclipse4696 == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            PolarVoyageCrashlyticsSolarThunder4289 polarVoyageCrashlyticsSolarThunder4289 = null;
            r4 = null;
            String str3 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
                            try {
                                Object obj2 = PolarVoyageZoomStateNeoDragonStorm9005.PolarVoyageCameraPixelBlaze2629;
                                PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185();
                                string = (String) PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageBarcodeScannerInfernoSolarSpark7767(((PolarVoyageZoomStateNeoDragonStorm9005) PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageWorkManagerShadowTitanium6734.class)).PolarVoyageKotlinBetaPulseBeta3653());
                            } catch (InterruptedException e) {
                                e = e;
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException | ExecutionException e2) {
                            e = e2;
                        }
                    }
                    String str4 = string;
                    PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision40683 = PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    PolarVoyageMotionLayoutTransitionHeroVision40683.PolarVoyageZipVortexCelestial6185();
                    String packageName = PolarVoyageMotionLayoutTransitionHeroVision40683.PolarVoyageZipVortexCelestial6185.getPackageName();
                    PolarVoyageDisplayMetricsMasterCosmos3783 polarVoyageDisplayMetricsMasterCosmos3783 = !PolarVoyageAdapterTitanSpark4027.PolarVoyageCameraViewSpectraMaxSpectra2824(extras) ? PolarVoyageDisplayMetricsMasterCosmos3783.DISPLAY_NOTIFICATION : PolarVoyageDisplayMetricsMasterCosmos3783.DATA_MESSAGE;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        objArr = 2;
                        if (objArr == 2) {
                            i2 = 5;
                        } else if (objArr == 1) {
                            i2 = 10;
                        }
                        int i3 = i2;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        String str5 = string3 != null ? string3 : "";
                        string4 = extras.getString("from");
                        if (string4 != null && string4.startsWith("/topics/")) {
                            str3 = string4;
                        }
                        String str6 = str3 != null ? str3 : "";
                        String string5 = extras.getString("collapse_key");
                        String str7 = string5 != null ? string5 : "";
                        String string6 = extras.getString("google.c.a.m_l");
                        String str8 = string6 != null ? string6 : "";
                        String string7 = extras.getString("google.c.a.c_l");
                        String str9 = string7 != null ? string7 : "";
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e3) {
                                Log.w("FirebaseMessaging", "error parsing project number", e3);
                            }
                            polarVoyageCrashlyticsSolarThunder4289 = new PolarVoyageCrashlyticsSolarThunder4289(parseLong > 0 ? parseLong : 0L, str5, str4, polarVoyageDisplayMetricsMasterCosmos3783, packageName, str7, i3, i, str6, str8, str9);
                        }
                        PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision40684 = PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
                        PolarVoyageCoordinatorLayoutOlympianVortex8571 polarVoyageCoordinatorLayoutOlympianVortex8571 = PolarVoyageMotionLayoutTransitionHeroVision40684.PolarVoyageKotlinBetaPulseBeta3653;
                        PolarVoyageMotionLayoutTransitionHeroVision40684.PolarVoyageZipVortexCelestial6185();
                        str = polarVoyageCoordinatorLayoutOlympianVortex8571.PolarVoyageBitmapVisionAuroraPixel4705;
                        if (str != null) {
                            try {
                                parseLong = Long.parseLong(str);
                            } catch (NumberFormatException e4) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e4);
                            }
                            polarVoyageCrashlyticsSolarThunder4289 = new PolarVoyageCrashlyticsSolarThunder4289(parseLong > 0 ? parseLong : 0L, str5, str4, polarVoyageDisplayMetricsMasterCosmos3783, packageName, str7, i3, i, str6, str8, str9);
                        }
                        PolarVoyageMotionLayoutTransitionHeroVision40684.PolarVoyageZipVortexCelestial6185();
                        str2 = polarVoyageCoordinatorLayoutOlympianVortex8571.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        if (str2.startsWith("1:")) {
                            String[] split = str2.split(":");
                            if (split.length >= 2) {
                                String str10 = split[1];
                                if (!str10.isEmpty()) {
                                    try {
                                        parseLong = Long.parseLong(str10);
                                    } catch (NumberFormatException e5) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                    }
                                }
                            }
                            parseLong = 0;
                        } else {
                            try {
                                parseLong = Long.parseLong(str2);
                            } catch (NumberFormatException e6) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e6);
                            }
                        }
                        polarVoyageCrashlyticsSolarThunder4289 = new PolarVoyageCrashlyticsSolarThunder4289(parseLong > 0 ? parseLong : 0L, str5, str4, polarVoyageDisplayMetricsMasterCosmos3783, packageName, str7, i3, i, str6, str8, str9);
                    }
                    if (Constants.HIGH.equals(string2)) {
                        if (!Constants.NORMAL.equals(string2)) {
                            objArr = 0;
                        }
                        objArr = 2;
                    } else {
                        objArr = 1;
                    }
                    if (objArr == 2) {
                    }
                    int i32 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        str3 = string4;
                    }
                    if (str3 != null) {
                    }
                    String string52 = extras.getString("collapse_key");
                    if (string52 != null) {
                    }
                    String string62 = extras.getString("google.c.a.m_l");
                    if (string62 != null) {
                    }
                    String string72 = extras.getString("google.c.a.c_l");
                    if (string72 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision406842 = PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    PolarVoyageCoordinatorLayoutOlympianVortex8571 polarVoyageCoordinatorLayoutOlympianVortex85712 = PolarVoyageMotionLayoutTransitionHeroVision406842.PolarVoyageKotlinBetaPulseBeta3653;
                    PolarVoyageMotionLayoutTransitionHeroVision406842.PolarVoyageZipVortexCelestial6185();
                    str = polarVoyageCoordinatorLayoutOlympianVortex85712.PolarVoyageBitmapVisionAuroraPixel4705;
                    if (str != null) {
                    }
                    PolarVoyageMotionLayoutTransitionHeroVision406842.PolarVoyageZipVortexCelestial6185();
                    str2 = polarVoyageCoordinatorLayoutOlympianVortex85712.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (str2.startsWith("1:")) {
                    }
                    polarVoyageCrashlyticsSolarThunder4289 = new PolarVoyageCrashlyticsSolarThunder4289(parseLong > 0 ? parseLong : 0L, str5, str4, polarVoyageDisplayMetricsMasterCosmos3783, packageName, str7, i32, i, str6, str8, str9);
                }
                i = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str42 = string;
                PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision406832 = PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
                PolarVoyageMotionLayoutTransitionHeroVision406832.PolarVoyageZipVortexCelestial6185();
                String packageName2 = PolarVoyageMotionLayoutTransitionHeroVision406832.PolarVoyageZipVortexCelestial6185.getPackageName();
                PolarVoyageDisplayMetricsMasterCosmos3783 polarVoyageDisplayMetricsMasterCosmos37832 = !PolarVoyageAdapterTitanSpark4027.PolarVoyageCameraViewSpectraMaxSpectra2824(extras) ? PolarVoyageDisplayMetricsMasterCosmos3783.DISPLAY_NOTIFICATION : PolarVoyageDisplayMetricsMasterCosmos3783.DATA_MESSAGE;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if (Constants.HIGH.equals(string2)) {
                }
                if (objArr == 2) {
                }
                int i322 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                if (str3 != null) {
                }
                String string522 = extras.getString("collapse_key");
                if (string522 != null) {
                }
                String string622 = extras.getString("google.c.a.m_l");
                if (string622 != null) {
                }
                String string722 = extras.getString("google.c.a.c_l");
                if (string722 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision4068422 = PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
                PolarVoyageCoordinatorLayoutOlympianVortex8571 polarVoyageCoordinatorLayoutOlympianVortex857122 = PolarVoyageMotionLayoutTransitionHeroVision4068422.PolarVoyageKotlinBetaPulseBeta3653;
                PolarVoyageMotionLayoutTransitionHeroVision4068422.PolarVoyageZipVortexCelestial6185();
                str = polarVoyageCoordinatorLayoutOlympianVortex857122.PolarVoyageBitmapVisionAuroraPixel4705;
                if (str != null) {
                }
                PolarVoyageMotionLayoutTransitionHeroVision4068422.PolarVoyageZipVortexCelestial6185();
                str2 = polarVoyageCoordinatorLayoutOlympianVortex857122.PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (str2.startsWith("1:")) {
                }
                polarVoyageCrashlyticsSolarThunder4289 = new PolarVoyageCrashlyticsSolarThunder4289(parseLong > 0 ? parseLong : 0L, str5, str42, polarVoyageDisplayMetricsMasterCosmos37832, packageName2, str7, i322, i, str6, str8, str9);
            }
            if (polarVoyageCrashlyticsSolarThunder4289 == null) {
                return;
            }
            try {
                PolarVoyageThemeOverlayPhantomTurboElite2256 polarVoyageThemeOverlayPhantomTurboElite2256 = new PolarVoyageThemeOverlayPhantomTurboElite2256(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                PolarVoyageSharedFlowCosmosAlpha1205 polarVoyageSharedFlowCosmosAlpha1205 = new PolarVoyageSharedFlowCosmosAlpha1205("proto");
                PolarVoyageR8UltraEliteBeta8736 polarVoyageR8UltraEliteBeta8736 = new PolarVoyageR8UltraEliteBeta8736(3);
                PolarVoyageFCMNeoTitaniumThunder4959 polarVoyageFCMNeoTitaniumThunder4959 = (PolarVoyageFCMNeoTitaniumThunder4959) polarVoyageVibratorMegaEclipse4696;
                Set set = polarVoyageFCMNeoTitaniumThunder4959.PolarVoyageZipVortexCelestial6185;
                if (!set.contains(polarVoyageSharedFlowCosmosAlpha1205)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", polarVoyageSharedFlowCosmosAlpha1205, set));
                }
                new PolarVoyageDrawableCosmosEclipseMax6944(polarVoyageFCMNeoTitaniumThunder4959.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageSharedFlowCosmosAlpha1205, polarVoyageR8UltraEliteBeta8736, polarVoyageFCMNeoTitaniumThunder4959.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageAnimatorSetSparkUltraMax8233(new PolarVoyageGradientDrawableSpectraStorm1252(new PolarVoyageHandlerNeoHyperion6368(polarVoyageCrashlyticsSolarThunder4289), polarVoyageThemeOverlayPhantomTurboElite2256));
            } catch (RuntimeException e7) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e7);
            }
        }
    }

    public static boolean PolarVoyageFlingGestureEclipsePrimeMax1376(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static void PolarVoyageGuidelineStormSolar2850(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static boolean PolarVoyageHandlerThreadMaxAurora5064(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final PolarVoyageInterpolatorDeltaEpicElite1676 PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729) {
        if ((polarVoyageGyroscopePulseAurora9729.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 2) != 0) {
            if (polarVoyageGyroscopePulseAurora9729 instanceof PolarVoyageInterpolatorDeltaEpicElite1676) {
                return (PolarVoyageInterpolatorDeltaEpicElite1676) polarVoyageGyroscopePulseAurora9729;
            }
            if (polarVoyageGyroscopePulseAurora9729 instanceof PolarVoyageServiceInfoPhantomBlaze1511) {
                PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora97292 = ((PolarVoyageServiceInfoPhantomBlaze1511) polarVoyageGyroscopePulseAurora9729).PolarVoyageMotionLayoutForceEpicAurora7183;
                while (polarVoyageGyroscopePulseAurora97292 != 0) {
                    if (polarVoyageGyroscopePulseAurora97292 instanceof PolarVoyageInterpolatorDeltaEpicElite1676) {
                        return (PolarVoyageInterpolatorDeltaEpicElite1676) polarVoyageGyroscopePulseAurora97292;
                    }
                    polarVoyageGyroscopePulseAurora97292 = (!(polarVoyageGyroscopePulseAurora97292 instanceof PolarVoyageServiceInfoPhantomBlaze1511) || (polarVoyageGyroscopePulseAurora97292.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 2) == 0) ? polarVoyageGyroscopePulseAurora97292.PolarVoyageCameraPixelBlaze2629 : ((PolarVoyageServiceInfoPhantomBlaze1511) polarVoyageGyroscopePulseAurora97292).PolarVoyageMotionLayoutForceEpicAurora7183;
                }
            }
        }
        return null;
    }

    public static final PolarVoyageConfigurationMegaTitaniumQuantum2348 PolarVoyageKeyframeEpicNovaXCyber9821(PolarVoyageRemoteModelManagerSpectraShadowNeo2910 polarVoyageRemoteModelManagerSpectraShadowNeo2910) {
        PolarVoyageCardViewNebulaTitanGamma6305 polarVoyageCardViewNebulaTitanGamma6305 = ((PolarVoyageGyroscopePulseAurora9729) polarVoyageRemoteModelManagerSpectraShadowNeo2910).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageSnackbarGammaEclipse2140;
        if (polarVoyageCardViewNebulaTitanGamma6305 != null) {
            return polarVoyageCardViewNebulaTitanGamma6305.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        }
        throw PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageKotlinBetaPulseBeta3653("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View PolarVoyageKotlinBetaPulseBeta3653(View view, View view2, int i) {
        int nextFocusForwardId;
        View PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        int i2 = 1;
        if (i != 1) {
            if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                PolarVoyageTransformTitanNovaPixel3702 polarVoyageTransformTitanNovaPixel3702 = new PolarVoyageTransformTitanNovaPixel3702(nextFocusForwardId, i2);
                View view3 = null;
                while (true) {
                    PolarVoyageLayerDrawableShadowTitaniumOmega1942 = PolarVoyageLayerDrawableShadowTitaniumOmega1942(view, polarVoyageTransformTitanNovaPixel3702, view3);
                    if (PolarVoyageLayerDrawableShadowTitaniumOmega1942 != null || view == view2) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            }
        } else if (view.getId() != -1) {
            PolarVoyageGestureDetectorRogueHyperSolar4116 polarVoyageGestureDetectorRogueHyperSolar4116 = new PolarVoyageGestureDetectorRogueHyperSolar4116(7, view2, view);
            View view5 = null;
            while (true) {
                View PolarVoyageLayerDrawableShadowTitaniumOmega19422 = PolarVoyageLayerDrawableShadowTitaniumOmega1942(view, polarVoyageGestureDetectorRogueHyperSolar4116, view5);
                if (PolarVoyageLayerDrawableShadowTitaniumOmega19422 != null || view == view2) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return null;
        }
        return null;
    }

    public static byte[] PolarVoyageKotlinHeroHyper4083(PolarVoyageGradlePluginGammaHero9871 polarVoyageGradlePluginGammaHero9871) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = polarVoyageGradlePluginGammaHero9871.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return PolarVoyageCameraPixelBlaze2629(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (polarVoyageGradlePluginGammaHero9871.read() == -1) {
            return PolarVoyageCameraPixelBlaze2629(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final View PolarVoyageLayerDrawableShadowTitaniumOmega1942(View view, PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492, View view2) {
        View PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        if (((Boolean) polarVoyageStateFlowNebulaMax1492.PolarVoyageZipVortexCelestial6185(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (PolarVoyageLayerDrawableShadowTitaniumOmega1942 = PolarVoyageLayerDrawableShadowTitaniumOmega1942(childAt, polarVoyageStateFlowNebulaMax1492, view2)) != null) {
                return PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            }
        }
        return null;
    }

    public static void PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087, PolarVoyageDrawerLayoutFusionPhoenixFusion7458 polarVoyageDrawerLayoutFusionPhoenixFusion7458) {
        int PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(5);
        polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(2);
        if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(5);
        }
        if (PolarVoyageTextInputEditTextNebulaHero66512 >= 7 && PolarVoyageTextInputEditTextNebulaHero66512 <= 10) {
            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDrawableDeltaHyperion5742();
        }
        if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
            int PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(3);
            if (polarVoyageDrawerLayoutFusionPhoenixFusion7458.PolarVoyageMotionLayoutTransitionHeroVision4068 == -1 && PolarVoyageTextInputEditTextNebulaHero66512 >= 0 && PolarVoyageTextInputEditTextNebulaHero66512 <= 15 && (PolarVoyageTextInputEditTextNebulaHero66513 == 0 || PolarVoyageTextInputEditTextNebulaHero66513 == 1)) {
                polarVoyageDrawerLayoutFusionPhoenixFusion7458.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageTextInputEditTextNebulaHero66512;
            }
            if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(polarVoyageAuthVortexNebulaNeo9087);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String PolarVoyageLifecycleOlympianOmega3762() {
        BufferedReader bufferedReader;
        String processName;
        if (PolarVoyageRotateAnimationCyberCelestialDelta4768 == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                PolarVoyageRotateAnimationCyberCelestialDelta4768 = processName;
            } else {
                int i = PolarVoyageBottomSheetOmegaNeo1907;
                if (i == 0) {
                    i = Process.myPid();
                    PolarVoyageBottomSheetOmegaNeo1907 = i;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        String str2 = "/proc/" + i + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                PolarVoyageRotateAnimationCyberCelestialDelta4768 = str;
            }
        }
        return PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public static PolarVoyageTransitionListenerCelestialElite5453 PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageCameraXCelestialNeoSolar7858 polarVoyageCameraXCelestialNeoSolar7858) {
        polarVoyageCameraXCelestialNeoSolar7858.getClass();
        return PolarVoyageViewModelScopeRogueFusion1953.PolarVoyageContentProviderHyperSpark3838(polarVoyageCameraXCelestialNeoSolar7858, new PolarVoyageMergePhoenixGamma5628(21));
    }

    public static boolean PolarVoyageMapTurboRogueTitan9291(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static PolarVoyageTextViewLegendTurbo6617 PolarVoyageMotionLayoutForceEpicAurora7183(String str, PolarVoyageBroadcastDragonShadowRogue6783 polarVoyageBroadcastDragonShadowRogue6783) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(PolarVoyageRotateAnimationBlazePixelTitan5297.PolarVoyageZipVortexCelestial6185(PolarVoyageFirebaseHeroHero8936.class));
        for (Class cls : new Class[0]) {
            PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageRemoteModelManagerOlympianCelestial9141(cls, "Null interface");
            hashSet.add(PolarVoyageRotateAnimationBlazePixelTitan5297.PolarVoyageZipVortexCelestial6185(cls));
        }
        PolarVoyageAssetManagerMasterMaster2094 PolarVoyageZipVortexCelestial61852 = PolarVoyageAssetManagerMasterMaster2094.PolarVoyageZipVortexCelestial6185(Context.class);
        if (hashSet.contains(PolarVoyageZipVortexCelestial61852.PolarVoyageZipVortexCelestial6185)) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(PolarVoyageZipVortexCelestial61852);
        return new PolarVoyageTextViewLegendTurbo6617(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new PolarVoyageTextWatcherPhantomStorm4467(4, str, polarVoyageBroadcastDragonShadowRogue6783), hashSet3);
    }

    public static final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextViewDragonEclipse8441 polarVoyageTextViewDragonEclipse8441, long j) {
        if (!polarVoyageTextViewDragonEclipse8441.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDisplayMetricsVortexDragon9516) {
            return false;
        }
        PolarVoyageGradientDrawableTurboForce1324 polarVoyageGradientDrawableTurboForce1324 = (PolarVoyageGradientDrawableTurboForce1324) PolarVoyageKeyframeEpicNovaXCyber9821(polarVoyageTextViewDragonEclipse8441).PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (!polarVoyageGradientDrawableTurboForce1324.PolarVoyageKeyframeEpicNovaXCyber9821.PolarVoyageDisplayMetricsVortexDragon9516) {
            return false;
        }
        long PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = polarVoyageGradientDrawableTurboForce1324.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 & 4294967295L));
        long j2 = polarVoyageTextViewDragonEclipse8441.PolarVoyageAlertDialogCyberHeroQuantum3938;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    public static void PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087, PolarVoyageDrawerLayoutFusionPhoenixFusion7458 polarVoyageDrawerLayoutFusionPhoenixFusion7458) {
        polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(2);
        boolean PolarVoyageDiffUtilTurboStrike57352 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735();
        int PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
        for (int i = 0; i < PolarVoyageTextInputEditTextNebulaHero66512; i++) {
            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(2);
            if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(5);
            }
            if (PolarVoyageDiffUtilTurboStrike57352) {
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(24);
            } else {
                if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                    if (!polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                        polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(4);
                    }
                    polarVoyageDrawerLayoutFusionPhoenixFusion7458.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(6) + 1;
                }
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(4);
            }
        }
        if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(3);
            if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(polarVoyageAuthVortexNebulaNeo9087);
            }
        }
    }

    public static final PolarVoyageRewardedAdUltraTitanium4787 PolarVoyageMotionSceneStormSolarBeta2208(PolarVoyageRemoteModelManagerSpectraShadowNeo2910 polarVoyageRemoteModelManagerSpectraShadowNeo2910) {
        PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = PolarVoyageKeyframeEpicNovaXCyber9821(polarVoyageRemoteModelManagerSpectraShadowNeo2910).PolarVoyageBitmapMaxTitanTitan7960;
        if (polarVoyageRewardedAdUltraTitanium4787 != null) {
            return polarVoyageRewardedAdUltraTitanium4787;
        }
        throw PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageKotlinBetaPulseBeta3653("This node does not have an owner.");
    }

    public static boolean PolarVoyageNavigationViewHyperHyperHyperion1793(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = PolarVoyageNavigationViewHyperHyperHyperion1793(file2) && z;
        }
        return z;
    }

    public static void PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087) {
        int PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(6);
        if (PolarVoyageTextInputEditTextNebulaHero66512 < 2 || PolarVoyageTextInputEditTextNebulaHero66512 > 42) {
            throw PolarVoyageToastNeoOmega7549.PolarVoyageMotionLayoutTransitionHeroVision4068(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(PolarVoyageTextInputEditTextNebulaHero66512)));
        }
        polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(PolarVoyageTextInputEditTextNebulaHero66512 * 8);
    }

    public static String PolarVoyagePackageManagerCelestialPhoenix8393(PolarVoyageViewPagerMegaAurora4578 polarVoyageViewPagerMegaAurora4578, int i) {
        polarVoyageViewPagerMegaAurora4578.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = polarVoyageViewPagerMegaAurora4578.PolarVoyageItemDecorationUltraDeltaEpic7485;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static final PolarVoyageServiceConnectionCyberOlympian8321 PolarVoyagePoseDetectionCosmosVision6217(PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718) {
        Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
        if (PolarVoyageAlarmManagerShadowHyperBeta8339 == PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185) {
            PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageServiceConnectionCyberOlympian8321();
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta8339);
        }
        PolarVoyageServiceConnectionCyberOlympian8321 polarVoyageServiceConnectionCyberOlympian8321 = (PolarVoyageServiceConnectionCyberOlympian8321) PolarVoyageAlarmManagerShadowHyperBeta8339;
        polarVoyageServiceConnectionCyberOlympian8321.PolarVoyageZipVortexCelestial6185(0, polarVoyageFlowCollectorEliteStrike5718);
        return polarVoyageServiceConnectionCyberOlympian8321;
    }

    public static final void PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    public static PolarVoyageValueAnimatorSparkDragonNovaX4109 PolarVoyageRemoteModelManagerOlympianCelestial9141(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (PolarVoyageValueAnimatorSparkDragonNovaX4109) newInstance;
            } catch (IllegalAccessException e) {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageCameraPixelBlaze2629("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageCameraPixelBlaze2629("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageCameraPixelBlaze2629("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static String PolarVoyageRotateAnimationCyberCelestialDelta4768(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || PolarVoyageDebugTitaniumInferno5712.PolarVoyageMotionLayoutForceEpicAurora7183(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !PolarVoyageCardViewAlphaVortexCelestial9747(str, i5, length)))) || (codePointAt == 43 && z3)))) {
                PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = new PolarVoyageSnackbarSpectraMasterMaster4120();
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(str, i4, i5);
                PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == i6 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageCanvasElitePhoenix4750("+");
                        } else if (codePointAt2 == 43 && z3) {
                            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageCanvasElitePhoenix4750(z ? "+" : "%2B");
                        } else {
                            if (codePointAt2 >= i6 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z4) && !PolarVoyageDebugTitaniumInferno5712.PolarVoyageMotionLayoutForceEpicAurora7183(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z && (!z2 || PolarVoyageCardViewAlphaVortexCelestial9747(str, i5, length))))) {
                                    polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(codePointAt2);
                                }
                            }
                            if (polarVoyageSnackbarSpectraMasterMaster41202 == null) {
                                polarVoyageSnackbarSpectraMasterMaster41202 = new PolarVoyageSnackbarSpectraMasterMaster4120();
                            }
                            polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(codePointAt2);
                            while (!polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageDiffUtilTurboStrike5735()) {
                                byte readByte = polarVoyageSnackbarSpectraMasterMaster41202.readByte();
                                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(37);
                                char[] cArr = PolarVoyageStrictModeLegendEpic1532;
                                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(cArr[((readByte & 255) >> 4) & 15]);
                                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(cArr[readByte & 15]);
                            }
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 32;
                }
                return polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyagePackageManagerCelestialPhoenix8393();
            }
            i5 += Character.charCount(codePointAt);
        }
        return str.substring(i4, length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] PolarVoyageSnackbarGammaEclipse2140(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static final boolean PolarVoyageStrictModeLegendEpic1532(PolarVoyageObserverSolarOmegaLegend8594 polarVoyageObserverSolarOmegaLegend8594, int i, PolarVoyageInputFilterLegendMaster1587 polarVoyageInputFilterLegendMaster1587, boolean z) {
        boolean z2;
        synchronized (PolarVoyageItemDecorationUltraDeltaEpic7485) {
            try {
                int i2 = polarVoyageObserverSolarOmegaLegend8594.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (i2 == i) {
                    polarVoyageObserverSolarOmegaLegend8594.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageInputFilterLegendMaster1587;
                    z2 = true;
                    if (z) {
                        polarVoyageObserverSolarOmegaLegend8594.PolarVoyageBitmapVisionAuroraPixel4705++;
                    }
                    polarVoyageObserverSolarOmegaLegend8594.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final PolarVoyageFlowNeoHero4295 PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageServiceConnectionCyberOlympian8321 polarVoyageServiceConnectionCyberOlympian8321, float f, float f2, PolarVoyageTransitionStrikeStormNovaX2413 polarVoyageTransitionStrikeStormNovaX2413, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718, int i) {
        Float valueOf = Float.valueOf(f);
        Float valueOf2 = Float.valueOf(f2);
        int i2 = (i & 1022) | 229376;
        Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
        Object obj = PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185;
        if (PolarVoyageAlarmManagerShadowHyperBeta8339 == obj) {
            PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageFlowNeoHero4295(polarVoyageServiceConnectionCyberOlympian8321, valueOf, valueOf2, polarVoyageTransitionStrikeStormNovaX2413);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta8339);
        }
        PolarVoyageFlowNeoHero4295 polarVoyageFlowNeoHero4295 = (PolarVoyageFlowNeoHero4295) PolarVoyageAlarmManagerShadowHyperBeta8339;
        boolean PolarVoyageItemDecorationUltraDeltaEpic74852 = ((((i2 & 112) ^ 48) > 32 && polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(valueOf)) || (i2 & 48) == 32) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageTransitionStrikeStormNovaX2413);
        Object PolarVoyageAlarmManagerShadowHyperBeta83392 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
        if (PolarVoyageItemDecorationUltraDeltaEpic74852 || PolarVoyageAlarmManagerShadowHyperBeta83392 == obj) {
            Object polarVoyageZipBetaTitanium3764 = new PolarVoyageZipBetaTitanium3764(valueOf, polarVoyageFlowNeoHero4295, valueOf2, polarVoyageTransitionStrikeStormNovaX2413, 1);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageZipBetaTitanium3764);
            PolarVoyageAlarmManagerShadowHyperBeta83392 = polarVoyageZipBetaTitanium3764;
        }
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBottomSheetOmegaNeo1907((PolarVoyageFragmentPulseEliteDragon8768) PolarVoyageAlarmManagerShadowHyperBeta83392, polarVoyageFlowCollectorEliteStrike5718);
        boolean PolarVoyageItemDecorationUltraDeltaEpic74853 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageServiceConnectionCyberOlympian8321);
        Object PolarVoyageAlarmManagerShadowHyperBeta83393 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
        if (PolarVoyageItemDecorationUltraDeltaEpic74853 || PolarVoyageAlarmManagerShadowHyperBeta83393 == obj) {
            PolarVoyageAlarmManagerShadowHyperBeta83393 = new PolarVoyageVibratorMasterAlphaNova2131(9, polarVoyageServiceConnectionCyberOlympian8321, polarVoyageFlowNeoHero4295);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta83393);
        }
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageDiffUtilTurboStrike5735(polarVoyageFlowNeoHero4295, (PolarVoyageStateFlowNebulaMax1492) PolarVoyageAlarmManagerShadowHyperBeta83393, polarVoyageFlowCollectorEliteStrike5718);
        return polarVoyageFlowNeoHero4295;
    }

    public static void PolarVoyageToolbarEclipseInfernoHero6368(Bundle bundle, String str) {
        try {
            PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = PolarVoyageAdapterTitanSpark4027.PolarVoyageCameraViewSpectraMaxSpectra2824(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068();
            PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185();
            if (PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextureViewQuantumDelta2831.class) == null) {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            } else {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final int PolarVoyageViewBindingPulseHeroSpeed5705(PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354) {
        PolarVoyageObserverSolarOmegaLegend8594 polarVoyageObserverSolarOmegaLegend8594 = polarVoyageOrientationSensorEpicHeroNova6354.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageObserverSolarOmegaLegend8594.getClass();
        return ((PolarVoyageObserverSolarOmegaLegend8594) PolarVoyageLaunchOmegaDragon4995.PolarVoyageStrictModeLegendEpic1532(polarVoyageObserverSolarOmegaLegend8594)).PolarVoyageBitmapVisionAuroraPixel4705;
    }

    public static int PolarVoyageViewRogueMaster4778(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new PolarVoyageAssetManagerUltraStormTurbo3953(context).PolarVoyageZipVortexCelestial6185.areNotificationsEnabled() ? 0 : -1;
        }
        PolarVoyageR8UltraEliteBeta8736.PolarVoyageItemDecorationUltraDeltaEpic7485("permission must be non-null");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageWithContextPulseSolarHyperion4393(Context context, Executor executor, PolarVoyagePermissionInfoNebulaSparkCosmos8006 polarVoyagePermissionInfoNebulaSparkCosmos8006, boolean z) {
        boolean z2;
        ?? r7;
        PolarVoyageAnimatedVectorDrawableMasterPulse5257[] polarVoyageAnimatedVectorDrawableMasterPulse5257Arr;
        PolarVoyageAnimatedVectorDrawableMasterPulse5257[] polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2;
        PolarVoyageAnimatedVectorDrawableMasterPulse5257[] polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? byteArrayOutputStream;
        PolarVoyageGeocoderEclipsePulseUltra5219 polarVoyageGeocoderEclipsePulseUltra5219;
        String str;
        String str2;
        FileInputStream PolarVoyageBarcodeScannerInfernoSolarSpark77672;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            PolarVoyageGeocoderEclipsePulseUltra5219 polarVoyageGeocoderEclipsePulseUltra52192 = new PolarVoyageGeocoderEclipsePulseUltra5219(assets, executor, polarVoyagePermissionInfoNebulaSparkCosmos8006, name, file2);
            byte[] bArr3 = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705(4, null);
                    }
                    polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageZipVortexCelestial6185 = true;
                    try {
                        try {
                            r7 = polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(6, e);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 != null) {
                            }
                            PolarVoyagePermissionInfoNebulaSparkCosmos8006 polarVoyagePermissionInfoNebulaSparkCosmos80062 = (PolarVoyagePermissionInfoNebulaSparkCosmos8006) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageKotlinBetaPulseBeta3653;
                            polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            byte[] bArr4 = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            boolean z11 = r7;
                            z11 = r7;
                            if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 != null) {
                            }
                            bArr = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
                        } catch (IOException e2) {
                            polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(7, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 != null) {
                            }
                            PolarVoyagePermissionInfoNebulaSparkCosmos8006 polarVoyagePermissionInfoNebulaSparkCosmos800622 = (PolarVoyagePermissionInfoNebulaSparkCosmos8006) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageKotlinBetaPulseBeta3653;
                            polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            byte[] bArr42 = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            boolean z112 = r7;
                            z112 = r7;
                            if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 != null) {
                            }
                            bArr = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IOException e3) {
                                    polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(7, e3);
                                    try {
                                        r7.close();
                                    } catch (IOException e4) {
                                        polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(7, e4);
                                    }
                                    polarVoyageAnimatedVectorDrawableMasterPulse5257Arr = null;
                                    polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageAnimatedVectorDrawableMasterPulse5257Arr;
                                    polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                    if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 != null) {
                                    }
                                    PolarVoyagePermissionInfoNebulaSparkCosmos8006 polarVoyagePermissionInfoNebulaSparkCosmos8006222 = (PolarVoyagePermissionInfoNebulaSparkCosmos8006) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageKotlinBetaPulseBeta3653;
                                    polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                    byte[] bArr422 = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 != null) {
                                    }
                                    bArr = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IllegalStateException e5) {
                                polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(8, e5);
                                r7.close();
                                polarVoyageAnimatedVectorDrawableMasterPulse5257Arr = null;
                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageAnimatedVectorDrawableMasterPulse5257Arr;
                                polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 != null) {
                                }
                                PolarVoyagePermissionInfoNebulaSparkCosmos8006 polarVoyagePermissionInfoNebulaSparkCosmos80062222 = (PolarVoyagePermissionInfoNebulaSparkCosmos8006) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageKotlinBetaPulseBeta3653;
                                polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                byte[] bArr4222 = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 != null) {
                                }
                                bArr = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            polarVoyageAnimatedVectorDrawableMasterPulse5257Arr = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageLifecycleOlympianOmega3762(r7, PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(r7, 4), (String) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageTextInputEditTextNebulaHero6651);
                            try {
                                r7.close();
                            } catch (IOException e6) {
                                polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(7, e6);
                            }
                            polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageAnimatedVectorDrawableMasterPulse5257Arr;
                        }
                        polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e7) {
                                polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(9, e7);
                                str = r7;
                            } catch (IOException e8) {
                                polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(7, e8);
                                str = r7;
                            } catch (IllegalStateException e9) {
                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                                polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(8, e9);
                                str = r7;
                            }
                            if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 == null) {
                                try {
                                    if (!Arrays.equals(PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageBottomSheetOmegaNeo1907, PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(PolarVoyageBarcodeScannerInfernoSolarSpark77672, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] PolarVoyageProcessCameraProviderQuantumCosmosPulse5576 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(PolarVoyageBarcodeScannerInfernoSolarSpark77672, 4);
                                    polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyagePackageManagerCelestialPhoenix8393(PolarVoyageBarcodeScannerInfernoSolarSpark77672, PolarVoyageProcessCameraProviderQuantumCosmosPulse5576, bArr3, polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2);
                                    PolarVoyageBarcodeScannerInfernoSolarSpark77672.close();
                                    polarVoyageGeocoderEclipsePulseUltra5219 = polarVoyageGeocoderEclipsePulseUltra52192;
                                    r7 = PolarVoyageProcessCameraProviderQuantumCosmosPulse5576;
                                    if (polarVoyageGeocoderEclipsePulseUltra5219 != null) {
                                        polarVoyageGeocoderEclipsePulseUltra52192 = polarVoyageGeocoderEclipsePulseUltra5219;
                                    }
                                } finally {
                                }
                            } else {
                                if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 != null) {
                                    PolarVoyageBarcodeScannerInfernoSolarSpark77672.close();
                                    str = str2;
                                }
                                polarVoyageGeocoderEclipsePulseUltra5219 = null;
                                r7 = str;
                                if (polarVoyageGeocoderEclipsePulseUltra5219 != null) {
                                }
                            }
                        }
                        PolarVoyagePermissionInfoNebulaSparkCosmos8006 polarVoyagePermissionInfoNebulaSparkCosmos800622222 = (PolarVoyagePermissionInfoNebulaSparkCosmos8006) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageKotlinBetaPulseBeta3653;
                        polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        byte[] bArr42222 = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 != null && bArr42222 != null) {
                            z7 = polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageZipVortexCelestial6185;
                            if (z7) {
                                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e10) {
                                polarVoyagePermissionInfoNebulaSparkCosmos800622222.PolarVoyageContentProviderHyperSpark3838(7, e10);
                                z8 = z7;
                            } catch (IllegalStateException e11) {
                                polarVoyagePermissionInfoNebulaSparkCosmos800622222.PolarVoyageContentProviderHyperSpark3838(8, e11);
                                z8 = z7;
                            }
                            if (PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageGuidelineStormSolar2850(byteArrayOutputStream, bArr42222, polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3)) {
                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705 = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                                z112222 = z8;
                            } else {
                                polarVoyagePermissionInfoNebulaSparkCosmos800622222.PolarVoyageContentProviderHyperSpark3838(5, null);
                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageZipVortexCelestial6185) {
                                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageDiffUtilTurboStrike5735);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705 = null;
                                                                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        z112222 = true;
                                        polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e13) {
                                        e = e13;
                                        z112222 = true;
                                        polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
                                } catch (IOException e15) {
                                    e = e15;
                                    polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705 = null;
                                polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                            }
                        }
                        if (z4) {
                            PolarVoyageGuidelineStormSolar2850(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705(4, null);
                        }
                        polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageZipVortexCelestial6185 = true;
                        r7 = polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 == null) {
                            }
                        }
                        PolarVoyagePermissionInfoNebulaSparkCosmos8006 polarVoyagePermissionInfoNebulaSparkCosmos8006222222 = (PolarVoyagePermissionInfoNebulaSparkCosmos8006) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageKotlinBetaPulseBeta3653;
                        polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 = (PolarVoyageAnimatedVectorDrawableMasterPulse5257[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        byte[] bArr422222 = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (polarVoyageAnimatedVectorDrawableMasterPulse5257Arr3 != null) {
                            z7 = polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageZipVortexCelestial6185;
                            if (z7) {
                            }
                        }
                        bArr = (byte[]) polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705(4, null);
                    }
                }
                PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
            }
            polarVoyageGeocoderEclipsePulseUltra52192.PolarVoyageBitmapVisionAuroraPixel4705(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e16) {
            polarVoyagePermissionInfoNebulaSparkCosmos8006.PolarVoyageContentProviderHyperSpark3838(7, e16);
            PolarVoyageSurfaceViewForceUltra5877.PolarVoyageKotlinBetaPulseBeta3653(context, false);
        }
    }

    public static final void PolarVoyageZipVortexCelestial6185(PolarVoyageDigitalInkRecognitionBetaDelta4802 polarVoyageDigitalInkRecognitionBetaDelta4802, PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729) {
        PolarVoyageDigitalInkRecognitionBetaDelta4802 PolarVoyageMotionLayoutForceEpicAurora7183 = PolarVoyageKeyframeEpicNovaXCyber9821(polarVoyageGyroscopePulseAurora9729).PolarVoyageMotionLayoutForceEpicAurora7183();
        int i = PolarVoyageMotionLayoutForceEpicAurora7183.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1;
        Object[] objArr = PolarVoyageMotionLayoutForceEpicAurora7183.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i < objArr.length) {
            while (i >= 0) {
                polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageMotionLayoutTransitionHeroVision4068((PolarVoyageGyroscopePulseAurora9729) ((PolarVoyageConfigurationMegaTitaniumQuantum2348) objArr[i]).PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageTextInputEditTextNebulaHero6651);
                i--;
            }
        }
    }
}
